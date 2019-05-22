package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        Scanner scanner = new Scanner(System.in);
        int array[]=new int[20];
        for (int i = 0; i <array.length ; i++) {
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max=array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}
