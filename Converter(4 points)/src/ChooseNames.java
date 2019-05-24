import java.util.Scanner;

public class ChooseNames {
    private static int command;

    public static void startProgram() {

        try {
            operationChoice();
        } catch (
                Exception ex) {
            System.out.println(ex);
            System.out.println("Program aborted");
        }
    }


    private static void operationChoice() {

        while (chooseCommand() != 0) {

            if (command < 0 || command > 2) {
                System.out.println("!!! Unknown command !!!");
            } else if (command == 1) {
                ChooseTypesTempConvert.startChooseTypes();
            } else {
                СhooseTypesDistConvert.startChooseTypes();
            }
        }
    }

    private static int chooseCommand() {
        System.out.println("Choose command: \n" +
                "1 - Temperature \n" +
                "2 - Distance \n" +
                "0 - exit");

        Scanner scan = new Scanner(System.in);
        return command = scan.nextInt();
    }
}
