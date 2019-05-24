import java.util.Scanner;

public class MainPalindrome {
    private static int command;

    public static void main(String[] args) {

        String text = "";

        while (chooseCommand() != 0) {

            if (command < 0 || command > 1) {
                System.out.println("!!! Unknown command !!!");
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your string:");
                text = scanner.next();
                System.out.println("String is palindrome? - " + isPalindrome(text));
                System.out.println();
            }
        }
    }

    private static int chooseCommand() {
        System.out.println("Choose command: \n" +
                "1 - String is Palindrom? \n" +
                "0 - exit");

        Scanner scan = new Scanner(System.in);
        return command = scan.nextInt();
    }

    private static boolean isPalindrome(String word) {
        return word.equals((new StringBuffer(word)).reverse().toString());
    }
}
