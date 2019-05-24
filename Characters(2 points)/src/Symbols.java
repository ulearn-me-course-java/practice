import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Symbols {

    public static void main(String[] args) throws IOException {
        count("C:/Users/Boggart/Desktop/DopZAdANIYA/Characters(2 points)/resources/test.txt");
    }

    public static void count(String fileName) throws IOException {

        int totalCharacters = 0;
        Scanner scanner = new Scanner(Paths.get(fileName));
        Hashtable<Character, ArrayList<Character>> dictionary = new Hashtable<>();

        while (scanner.hasNext()) {
            char[] str = scanner.next().toLowerCase().toCharArray();

            for (int i = 0; i < str.length; i++) {

                if (!Character.isLetter(str[i])) continue;
                if (!dictionary.containsKey(str[i])) dictionary.put(str[i], new ArrayList<>());

                ArrayList<Character> list = dictionary.get(str[i]);
                list.add(str[i]);

                totalCharacters++;
            }
        }

        System.out.println("Всего букв - " + totalCharacters);

        for (ArrayList<Character> list : dictionary.values()) {
            float percent = ((float) list.size() * 100) / totalCharacters;
            System.out.println("Вероятность встретить букву - '" + list.get(0) + "' = " + " " + percent + "%");
        }
    }
}



