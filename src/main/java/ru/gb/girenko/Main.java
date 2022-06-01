package ru.gb.girenko;

public class Main {
    public static void main(String[] args) {
        String [][] arr1 = {{"1","2","0","7"},
                            {"0","7","8","5"},
                            {"2","8","9","4"},
                            {"3","5","0","3"}};

        String [][] arr2 = {{"1","2","0","7"},
                            {"0","7"},
                            {"2","8","9","4"},
                            {"3","5","0","3"}};

        String [][] arr3 = {{"1","2","0","7"},
                            {"0","7","/","5"},
                            {"2","8","9","4"},
                            {"3","5","0","3"}};

        try {
            System.out.println("arr1");
            System.out.println("Сумма массива: "+ ArraySize.arr(arr1));
        } catch (NewException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("arr2");
            System.out.println("Сумма массива: "+ ArraySize.arr(arr2));
        } catch (NewException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("arr3");
            System.out.println("Сумма массива: "+ ArraySize.arr(arr3));
        } catch (NewException e){
            System.out.println(e.getMessage());
        }
    }
}
