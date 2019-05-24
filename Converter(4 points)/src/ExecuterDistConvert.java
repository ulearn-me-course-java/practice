import java.util.Scanner;

public class ExecuterDistConvert {

    public static void commandProcessing(int command) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number (or 'back' to return to the menu): ");
        while (scanner.hasNextLine()) {
            double number = scanner.nextDouble();

            if(scanner.nextLine().equals("back")) {
                ChooseNames.startProgram();
            }

            if (command == 1) {
                DistConvertationFromMetrAndBack.DistMetrToKilometr(number);
            }

            if (command == 2) {
                DistConvertationFromMetrAndBack.DistKilometrToMetr(number);
            }


            if (command == 3) {
                DistConvertationFromMetrAndBack.DistMetrToYard(number);
            }

            if (command == 4) {
                DistConvertationFromMetrAndBack.DistYardToMetr(number);
            }


            if (command == 5) {
                DistConvertationFromMetrAndBack.DistMetrToMilya(number);
            }

            if (command == 6) {
                DistConvertationFromMetrAndBack.DistMilyaToMetr(number);
            }


            if (command == 7) {
                DistConvertationFromMetrAndBack.DistMetrToDyuym(number);
            }

            if (command == 8) {
                DistConvertationFromMetrAndBack.DistDyuymToMetr(number);
            }

            System.out.println();
            System.out.println("Enter your number(or 'back' to return to the menu): ");
        }
        System.out.println();
    }
}

