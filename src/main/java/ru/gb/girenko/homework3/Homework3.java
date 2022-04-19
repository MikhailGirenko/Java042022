package ru.gb.girenko.homework3;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
       arrayZeroOne();
       System.out.println();
       array100();
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
}
