package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));

//
    }
}
