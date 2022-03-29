package Sorting;

import java.util.Arrays;

public class Latihan1Sorting {
    public static void main(String[] args) {
        int arr [] = {50, 70, 14, 35, 44, 23, 59, 4, 65};
        System.out.println("Data array sebelum diurutkan");
        for (int i = 0; i <arr.length; i++)
        {
            System.out.println(arr[i] + " , ") ;
        }
        System.out.println("");
        Arrays.sort(arr);
        System.out.println("Data array setelah diurutkan : ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " , ");
        }
    }
}
