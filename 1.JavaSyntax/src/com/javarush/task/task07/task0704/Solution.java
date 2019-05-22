package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int massiv[] = new int[10];
        for (int i = 0; i < massiv.length ; i++) {
            massiv[i] = Integer.parseInt(reader.readLine());

        }


      /*  for (int i = 0; i <massiv.length ; i++) {
            System.out.println(massiv[i]);
        }*/
        for (int i = 0; i < massiv.length ; i++) {
            System.out.println(massiv[massiv.length - i - 1]);
        }
    }
}

