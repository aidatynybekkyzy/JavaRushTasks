package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int [] massiv = new int[10];
        String[] array = new String[10];
        for (int i = 0; i <array.length ; i++) {
            array[i]=scanner.nextLine();
        }


       /* for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }*/
        for (int i = 0; i <massiv.length ; i++) {
            massiv[i]=array[i].length();

        }
        for (int i = 0; i <massiv.length ; i++) {
            System.out.println(massiv[i]);
        }


    }
}
