package ru.gb.girenko.homework2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(firstTask(16,5));
        System.out.println(secondTask(-3));
    }
    public static boolean firstTask(int a, int b ){
        if (a+b >= 10 && a+b <= 20){
            return true;
        }else {
            return false;
        }
    }
    public static String secondTask(int a){
        if(a>=0){
            return "Число положительное!";
        }else {
            return "Число отрицательное!";
        }
    }
}
