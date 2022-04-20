package ru.gb.girenko.homework3;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
       arrayZeroOne();
       System.out.println();
       System.out.println();
       array100();
       System.out.println();
       System.out.println();
       sixArray();
       System.out.println();
       System.out.println();
       fourthTask();
       System.out.println();
       System.out.print(Arrays.toString(fifthTask(5,25)));

    }
    public static void arrayZeroOne() {
        int [] nums = {0,0,0,1,0,1,0,1,0,1,0,1,1};
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length; i++) {
            if (nums[i]==0) {
                nums[i]=1;
            }else {
                nums[i]=0;
            }
            System.out.print(nums[i] + ", ");
        }
    }

    public static void array100() {
        int[] arr = new int[100];
        for(int i = 0, j=1; i<arr.length;i++, j++){
            arr[i]=j;
            }
        System.out.print(Arrays.toString(arr));
    }
    public static void sixArray(){
       int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print(Arrays.toString(arr));
        System.out.println();
       for(int i = 0; i<arr.length; i++){
           if(arr[i]<6){
               arr[i]=arr[i]*2;
           }
       }
        System.out.print(Arrays.toString(arr));
    }
    public static void fourthTask(){
        int[][]x = new int[4][4];

        for(int i = 0; i< x.length;i++){
            for (int j=0, y= x.length-1; j< x[i].length; j++, y--){
                if(i==j || i==y){
                    x[i][j]=1;
                }
                System.out.print(x[i][j]+", ");
            }
            System.out.println();
        }
    }
    public static int[] fifthTask(int len, int initialValue){
        int arr[] = new int[len];
        for (int i=0;i< arr.length;i++){
            arr[i]=initialValue;
        }
        return arr;
    }
}
