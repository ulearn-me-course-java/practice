import java.util.Scanner;

public class Reader {
    private static int command;
    private static String text = "";

    public static void startProgram() {

        try {
            Reader.enterText();
            Reader.operationChoice();

        } catch (
                Exception ex) {
            System.out.println(ex);
            System.out.println("Program aborted");
        }
    }

    private static void enterText() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your line:");
        while (scanner.hasNextLine()) {

            text += scanner.nextLine() + "\n";

            System.out.println("Finish? (y - yes, n - no) ");
            if (scanner.nextLine().equals("y")) {
                break;
            }
            System.out.println("Enter your line:");
        }
    }

    private static void operationChoice() {

        System.out.println(text);
        while (chooseCommand() != 0) {

            if (command < 0 || command > 6) {
                System.out.println("!!! Unknown command !!!");
            } else {
                Executer.commandProcessing(command, text);
            }
        }
    }

    private static int chooseCommand() {
        System.out.println("Choose command: \n" +
                "1 - Number of characters in the text \n" +
                "2 - Number of words in the text \n" +
                "3 - Number of lines in the text \n" +
                "4 - The maximum length of the string in the text \n" +
                "5 - Convert text to uppercase \n" +
                "6 - Convert text to lowercase \n" +
                "0 - exit");

        Scanner scan = new Scanner(System.in);
        return command = scan.nextInt();
    }
}
