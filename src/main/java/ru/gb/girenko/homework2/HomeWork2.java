package ru.gb.girenko.homework2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(firstTask(16,5));
    }
    public static boolean firstTask(int a, int b ){
        if (a+b >= 10 && a+b <= 20){
            return true;
        }else {
            return false;
        }
    }
}
