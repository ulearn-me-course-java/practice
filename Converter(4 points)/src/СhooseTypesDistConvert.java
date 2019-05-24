import java.util.InputMismatchException;
import java.util.Scanner;

public class СhooseTypesDistConvert {
    private static int command;

    public static void startChooseTypes() {

        try {
            operationChoice();
        }catch (InputMismatchException ex) {
            ChooseNames.startProgram();
        } catch (
                Exception ex) {
            System.out.println();
        }
    }


    private static void operationChoice() {

        while (chooseCommand() != 0) {


            if (command < 0 || command > 8) {
                System.out.println("!!! Unknown command !!!");
            } else {
                ExecuterDistConvert.commandProcessing(command);
            }
        }
    }

    private static int chooseCommand() {
        System.out.println("Choose command: \n" +

                "1 - Metr To Kilometr \n" +
                "2 - Kilometr To Metr \n" +

                "3 - Metr To Yard \n" +
                "4 - Yard To Metr \n" +

                "5 - Metr To Milyz \n" +
                "6 - Milyz To Metr \n" +

                "7 - Metr To Dyuym \n" +
                "8 - Dyuym To Metr \n" +

                "0 - exit");

        Scanner scan = new Scanner(System.in);
        return command = scan.nextInt();
    }
}


