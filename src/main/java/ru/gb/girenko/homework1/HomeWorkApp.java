package ru.gb.girenko.homework1;

public class HomeWorkApp {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 2;
        int b = -3;
        if (a+b>=0) {
            System.out.println("Сумма положительная");
        } else{
            System.out.println("Сумма отрицательная");
        }
    }
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
    }
}
