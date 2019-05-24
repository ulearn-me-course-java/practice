public class TempConvertationFromCelsiusAndBack {

    public static void TempCelsiusToFahrenheat(double num) {
        System.out.println(num + " Градус(а/ов) Цельсия равно - " + (num * 1.8 + 32) + " градус(a/ов) Фаренгейта");
    }

    public static void TempFahrenheatToCelsius(double num) {
        System.out.println(num + " Градус(а/ов) Фаренгейта равно - " + ((num - 32) / 1.8) + " градус(a/ов) Цельсия");
    }


    public static void TempCelsiusToKelvin (double num) {
        System.out.println(num + " Градус(а/ов) Цельсия равно - " + (num + 273.15) + " градус(a/ов) Кельвина");
    }

    public static void TempKelvinToCelsius (double num) {
        System.out.println(num + " Градус(а/ов) Кельвина равно - " + (num - 273.15) + " градус(a/ов) Цельсия");
    }


    public static void TempCelsiusToRankin (double num) {
        System.out.println(num + " Градус(а/ов) Цельсия равно - " + (num * 1.8 + 491.67) + " градус(a/ов) Ранкина");
    }

    public static void TempRankinToCelsius (double num) {
        System.out.println(num + " Градус(а/ов) Ранкина равно - " + ((num - 491.67) / 1.8) + " градус(a/ов) Цельсия");
    }


    public static void TempCelsiusToNewton (double num) {
        System.out.println(num + " Градус(а/ов) Цельсия равно - " + (num * 0.33) + " градус(a/ов) Ньютона");
    }

    public static void TempNewtonToCelsius (double num) {
        System.out.println(num + " Градус(а/ов) Нютона равно - " + (num / 0.33) + " градус(a/ов) Цельсия");
    }


    public static void TempCelsiusToReomyur (double num) {
        System.out.println(num + " Градус(а/ов) Цельсия равно - " + (num * 0.8) + " градус(a/ов) Реомюра");
    }

    public static void TempReomyurToCelsius (double num) {
        System.out.println(num + " Градус(а/ов) Реомюра равно - " + (num / 0.8) + " градус(a/ов) Цельсия");
    }


    public static void TempCelsiusToRyomer (double num) {
        System.out.println(num + " Градус(а/ов) Цельсия равно - " + ((num * 0.525) + 7.5) + " градус(a/ов) Рёмера");
    }

    public static void TempRyomerToCelsius (double num) {
        System.out.println(num + " Градус(а/ов) Рёмера равно - " + ((num - 7.5) / 0.525) + " градус(a/ов) Цельсия");
    }


    public static void TempCelsiusToDelil (double num) {
        System.out.println(num + " Градус(а/ов) Цельсия равно - " + ((num * 1.5) - 100) + " градус(a/ов) Делиля");
    }

    public static void TempDelilToCelsius (double num) {
        System.out.println(num + " Градус(а/ов) Делиля равно - " + ((num + 100) / 1.5) + " градус(a/ов) Цельсия");
    }
}
