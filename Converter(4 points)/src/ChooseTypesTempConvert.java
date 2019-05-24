import java.util.InputMismatchException;
import java.util.Scanner;

public class ChooseTypesTempConvert {
    private static int command;

    public static void startChooseTypes() {

        try {
            operationChoice();
        } catch (InputMismatchException ex) {
            ChooseNames.startProgram();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }


    private static void operationChoice() {

        while (chooseCommand() != 0) {

            if (command < 0 || command > 14) {
                System.out.println("!!! Unknown command !!!");
            } else {
                ExecuterTempConvert.commandProcessing(command);
            }
        }
    }

    private static int chooseCommand() {
        System.out.println("Choose command: \n" +

                "1 - Celsius To Fahrenheat \n" +
                "2 - Fahrenheat To Celsius \n" +

                "3 - Celsius To Kelvin \n" +
                "4 - Kelvin To Celsius \n" +

                "5 - Celsius To Rankin \n" +
                "6 - Rankin To Celsius \n" +

                "7 - Celsius To Newton \n" +
                "8 - Newton To Celsius \n" +

                "9 - Celsius To Reomyur \n" +
                "10 - Reomyur To Celsius \n" +

                "11 - Celsius To Ryomer \n" +
                "12 - Ryomer To Celsius \n" +

                "13 - Celsius To Delil  \n" +
                "14 - Delil  To Celsius \n" +

                "0 - exit");

        Scanner scan = new Scanner(System.in);
        return command = scan.nextInt();
    }
}

