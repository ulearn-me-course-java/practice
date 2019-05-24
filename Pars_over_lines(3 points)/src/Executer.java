import java.util.Scanner;


public class Executer {

    private static int numberOfCharacters = 0;
    private static int numberOfWords = 0;
    private static int numberOfLines = 0;
    private static int maxLength = 0;

    public static void commandProcessing(int command, String text) {
        Scanner scanner = new Scanner(text);

        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();

            if (command == 1) {
                numberOfCharacters += str.length();
            } //number of characters

            if (command == 2) {
                str = str.replace("  ", " "); //text correction...
                String[] words = str.split(" ");
                for (String word : words) {
                    numberOfWords++;
                }
            } //number of words

            if (command == 3) {
                numberOfLines++;
            } //number of lines

            if (command == 4) {
                if (str.length() > maxLength) maxLength = str.length();
            } //maximum length of the string

            if (command == 5) {
                System.out.println(str.toUpperCase());
            } //to upper

            if (command == 6) {
                System.out.println(str.toLowerCase());
            } //to lower
        }
        result(command);
        System.out.println();
    }

    private static void result(int command) {

        if (command == 1) {
            System.out.println("Number of Characters in the text = " + numberOfCharacters);
            numberOfCharacters = 0;
        }

        if (command == 2) {
            System.out.println("Number of Words in the text = " + numberOfWords);
            numberOfWords = 0;
        }

        if (command == 3) {
            System.out.println("Number of Lines in the text = " + numberOfLines);
            numberOfLines = 0;
        }

        if (command == 4) {
            System.out.println("The maximum length of the string in the text = " + maxLength);
            maxLength = 0;
        }
    }
}
