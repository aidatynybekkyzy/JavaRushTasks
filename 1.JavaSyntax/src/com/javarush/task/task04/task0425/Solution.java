package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int chislo1 =  scanner.nextInt();
        int chislo2 = scanner.nextInt();
        if(chislo1>0&&chislo2>0){
            System.out.println(1);
        }
        else if(chislo1<0&&chislo2>0){
            System.out.println(2);
        }
        else if(chislo1<0&&chislo2<0){
            System.out.println(3);
        }
        else if(chislo1>0&&chislo2<0){
            System.out.println(4);
        }
    }
}
