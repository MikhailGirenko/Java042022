package ru.gb.girenko;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
 из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.*/

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>(20);
        countries.add("Australia");
        countries.add("Cameroon");
        countries.add("Chile");
        countries.add("Finland");
        countries.add("Greece");
        countries.add("Ukraine");
        countries.add("Uzbekistan");
        countries.add("Russia");
        countries.add("Australia");
        countries.add("Cameroon");
        countries.add("Australia");
        countries.add("Russia");
        countries.add("Greece");
        countries.add("Norway");
        countries.add("Finland");

        HashSet<String> unique = new HashSet<>(countries);

        System.out.println("Исходный массив:");
        System.out.println(countries);
        System.out.println("Уникальные слова:");
        System.out.println(unique);
        System.out.println();
        for (String n : unique) {
            System.out.println(n+ ": "+Collections.frequency(countries,n));
        }



    }
}
