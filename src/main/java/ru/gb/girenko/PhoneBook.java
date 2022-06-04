package ru.gb.girenko;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    private HashMap<String, HashSet<String>> line;

    public PhoneBook() {
        this.line = new HashMap<>();
    }

    public void add (String surname, String phone){
        HashSet <String> numbers;

        if(line.containsKey(surname)){
           numbers = line.get(surname);
        }else {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        line.put(surname,numbers);
    }
    Set<String> get(String surname){
        return line.get(surname);
    }
}
