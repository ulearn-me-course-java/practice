import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

    private static ScriptEngine engine;
    private static String[] operations = new String[] { "+", "-", "*", "/", "" };

    private static String number = "10765432";
    private static int targetValue = 100;
    private static int threadsCount = 4;


    private static String baseConversion(String number, int srcBase, int destBase) {

        return Integer.toString(Integer.parseInt(number, srcBase), destBase);
    }

    private static String completeMask(String mask, int count) {

        if(mask.length() >= count)
            return mask;

        count = count - mask.length();

        for(int i = 0; i < count; i++)
            mask = "0" + mask;

        return mask;
    }


    private static void iterateMasks(int[] numbers, int from, int to) {

        for(int i = from; i < to; i++) {

            String mask = baseConversion(Integer.toString(i), 10, operations.length);

            mask = completeMask(mask, numbers.length - 1);

            executeMask(numbers, mask);
        }
    }

    private static void executeMask(int[] numbers, String mask) {

        try {
            StringBuilder expression = new StringBuilder(Integer.toString(numbers[0]));

            for (int i = 0; i < mask.length(); i++) {
                String currentOperation = operations[Character.getNumericValue(mask.charAt(i))];

                if (currentOperation.equals("")) {
                    expression.append(numbers[i + 1]);
                    continue;
                }

                expression
                        .append(" ")
                        .append(operations[Character.getNumericValue(mask.charAt(i))])
                        .append(" ")
                        .append(numbers[i + 1]);
            }

            Object result = engine.eval(expression.toString());

            if (result instanceof Integer)
                if (((Integer) result) == targetValue)
                    System.out.println(expression + " = " + targetValue);
        }
        catch (ScriptException ex) {

            System.out.println("executeMask::" + ex.getMessage());
        }
    }


    public static void main(String[] args) {

        int[] numbers = new int[number.length()];

        for(int i = 0; i < numbers.length; i++)
            numbers[i] = Character.getNumericValue(number.charAt(i));

        engine = new ScriptEngineManager().getEngineByName("javascript");

        int iterationsCount = (int) Math.pow(operations.length, numbers.length - 1);
        int countPerThread = iterationsCount / threadsCount;

        for(int i = 0; i < threadsCount; i++) {

            int from = i * countPerThread;
            int to = i == (threadsCount - 1) ? iterationsCount : i * countPerThread + countPerThread - 1;

            Thread thread = new Thread(() -> iterateMasks(numbers, from, to));
            thread.start();
        }
    }
}
