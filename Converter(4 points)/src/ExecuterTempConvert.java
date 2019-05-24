import java.util.Scanner;

public class ExecuterTempConvert {

    public static void commandProcessing(int command) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number(or 'back' to return to the menu): ");
        while (scanner.hasNextLine()) {
            double number = scanner.nextDouble();

            if(scanner.nextLine().equals("back")) {
                ChooseNames.startProgram();
            }

            if (command == 1) {
                TempConvertationFromCelsiusAndBack.TempCelsiusToFahrenheat(number);
            }

            if (command == 2) {
                TempConvertationFromCelsiusAndBack.TempFahrenheatToCelsius(number);
                }


            if (command == 3) {
                TempConvertationFromCelsiusAndBack.TempCelsiusToKelvin(number);
            }

            if (command == 4) {
                TempConvertationFromCelsiusAndBack.TempKelvinToCelsius(number);
            }


            if (command == 5) {
                TempConvertationFromCelsiusAndBack.TempCelsiusToRankin(number);
            }

            if (command == 6) {
                TempConvertationFromCelsiusAndBack.TempRankinToCelsius(number);
            }


            if (command == 7) {
                TempConvertationFromCelsiusAndBack.TempCelsiusToNewton(number);
            }

            if (command == 8) {
                TempConvertationFromCelsiusAndBack.TempNewtonToCelsius(number);
            }


            if (command == 9) {
                TempConvertationFromCelsiusAndBack.TempCelsiusToReomyur(number);
            }

            if (command == 10) {
                TempConvertationFromCelsiusAndBack.TempReomyurToCelsius(number);
            }


            if (command == 11) {
                TempConvertationFromCelsiusAndBack.TempCelsiusToRyomer(number);
            }

            if (command == 12) {
                TempConvertationFromCelsiusAndBack.TempRyomerToCelsius(number);
            }


            if (command == 13) {
                TempConvertationFromCelsiusAndBack.TempCelsiusToDelil(number);
            }

            if (command == 14) {
                TempConvertationFromCelsiusAndBack.TempDelilToCelsius(number);
            }

            System.out.println();
            System.out.println("Enter your number(or 'back' to return to the menu): ");
        }
        System.out.println();
    }
}
