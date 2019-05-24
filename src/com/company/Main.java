package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String str = "jllf      g";
        countOfChars(str.replaceAll(" ", ""));
    }

    public static void countOfChars(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] newStr;
        char[] d = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(d[i]))
                map.put(d[i], 1);
            else {
                int w = map.get(d[i]).intValue();
                w++;
                map.put(d[i], w);

            }

        }
        map.forEach((k, v) -> System.out.println("Количество букв " + k + "-" + 100d*v/str.length()+"%"));


    }


}

