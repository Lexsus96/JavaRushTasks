package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> mas = new ArrayList<>(Arrays.asList(new Integer[33]));
        Collections.fill(mas, 0);

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine().toLowerCase();
            list.add(s);
            for(char x: s.toCharArray()) {
                if (x == 'ё') {
                    mas.set(6, mas.get(6) + 1);
                } else if( x >= 'а' && x <= 'я') {
                    if (x <= 'е'){
                        mas.set((int) x - 'а', mas.get((int) x - 'а') + 1);
                    } else {
                        mas.set(((int) x - 'а') + 1, mas.get((int) x - 'а' + 1) + 1);
                    }
                }
            }
        }
        for (int i = 0; i < mas.size(); i++) {
            System.out.printf("%c %d\n", alphabet.get(i), mas.get(i));
        }



        // напишите тут ваш код
    }
}
