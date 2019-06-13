import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите два числа (пределы включительно)");
        Scanner scanner = new Scanner(System.in);
        //Указываем диапазон для поиска
        long a = scanner.nextInt(), b = scanner.nextInt();

        //Циклом проходим по всем числам в диапазоне
        for (long i = a; i <= b; i++) {
            //Модуль числа, чтобы не считать отрицательные числа
            long copyI = Math.abs(i), sum = 0;

            //Считаем сумму кубов,
            // разбивая число на простые числа. Например: 407 - это числа 4, 0 и 7
            while (copyI != 0) {
                sum += Cube(copyI % 10);
                copyI /= 10;
            }

            //Если сумма кубов простых чисел равна самому числу, то выводим её
            if (sum == i)
                Print(i);
        }
    }

    public static long Cube(long a) {
        return a * a * a;
    }

    private static void Print(long a) {
        String sA = String.valueOf(a);
        for (int i = 0; i < sA.length(); i++) {
            if (sA.charAt(i) == '-') {
                System.out.print("-(");
            }
            System.out.print(sA.charAt(i) + "^3" + (i != sA.length() - 1 ? "+" : "="));
        }
        System.out.println(a);
    }
}
