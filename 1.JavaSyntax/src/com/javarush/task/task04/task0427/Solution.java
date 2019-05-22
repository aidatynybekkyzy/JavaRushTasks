package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
Scanner scanner = new Scanner(System.in);
int chislo = scanner.nextInt();
if(chislo%2==0 && (chislo>=1 && chislo<=9)){
    System.out.println("четное однозначное число" );
}
else  if(chislo%2!=0 && (chislo>=1 && chislo<=9)){
            System.out.println("нечетное однозначное число" );
        }
else  if(chislo%2==0 && (chislo>=10&& chislo<=99)){
    System.out.println("четное двузначное число" );
}else  if(chislo%2!=0 && (chislo>=10 && chislo<=99)){
    System.out.println("нечетное двузначное число" );
}
else  if(chislo%2==0 && (chislo>=100 && chislo<=999)){
    System.out.println("четное трехзначное число" );
}else  if(chislo%2!=0 && (chislo>=100 && chislo<=999)){
    System.out.println("нечетное трехзначное число" );
}

    }
}
