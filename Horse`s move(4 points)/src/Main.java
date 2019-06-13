import java.io.IOException;
import java.io.InputStream;

public class Main {
    // Взял готовую матрицу обхождения шахматной доски конём из википедии
    //https://ru.wikipedia.org/wiki/Задача_о_ходе_коня


    static int[][] desc = {
            {50, 11, 24, 63, 14, 37, 26, 35},      //A
            {23, 62, 51, 12, 25, 34, 15, 38},      //B
            {10, 49, 64, 21, 40, 13, 36, 27},      //C
            {61, 22, 9, 52, 33, 28, 39, 16},       //D
            {48, 7, 60, 1, 20, 41, 54, 29},        //E
            {59, 4, 45, 8, 53, 32, 17, 42},        //F
            {6, 47, 2, 57, 44, 19, 30, 55},        //G
            {3, 58, 5, 46, 31, 56, 43, 18}         //H
    };

    public static void main(String[] args) throws IOException {
        System.out.println("Введите позицию в стиле {[Заглавная буква от A до H][цифра от 1 до 8]}");
        InputStream inputStream = System.in;

        //Указываем данные для начальной позиции, с которой начнем обходить шахматную доску
        int first = (char) inputStream.read() - 'A';
        int second = (char) inputStream.read() - '1';

        //Обозначаем начальную позицию
        int beginCycle = desc[first][second];

        //Boolean переменная для того чтобы потом выйти из цикла
        boolean exitCycle;

        //циклом проходим по всей матрице начиная с beginCircle позиции
        for (int i = beginCycle + 1; i != beginCycle; i = (i + 1) % 64) {
            exitCycle = false;

            //x - буква, y - цифра
            for (int x = 0; x < 8; x++) {
                for (int y = 0; y < 8; y++) {

                    //если находим следущий шаг, то возвращаем его позицию и "идем" искать следующую позицию
                    if (desc[x][y] == i) {
                        System.out.println((char) (x + 'A') + "" + (char) (y + '1'));
                        exitCycle = true;
                        break;
                    }
                }
                if (exitCycle)
                    break;
            }
        }
    }
}