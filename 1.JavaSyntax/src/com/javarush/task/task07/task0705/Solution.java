package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int bigArr[] = new int[20];
        for (int i = 0; i <bigArr.length ; i++) {
            bigArr[i]=scanner.nextInt();
        }
        int smallArr1 []  = new int [10];
        int smallArr2[] = new int[10] ;
       /*smallArr1= Arrays.copyOfRange(bigArr, 0, 9);
       smallArr2= Arrays.copyOfRange(bigArr, 10, 19);*/
        for (int i = 0; i <bigArr.length/2 ; i++) {
            smallArr1[i]=bigArr[i];
        }
        for (int i = 10; i<bigArr.length ; i++) {
            smallArr2[i-10]= bigArr[i];
          //  smallArr2[i]=bigArr[i+10];
        }
        for (int i = 0; i<bigArr.length/2 ; i++) {
            System.out.println(smallArr2[i]);
        }
    }
}
