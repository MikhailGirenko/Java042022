package ru.gb.girenko;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
 из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
  2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
  В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии.
  Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
  выводиться все телефоны.
  Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля
  (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
   Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().*/
public class Main {
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
