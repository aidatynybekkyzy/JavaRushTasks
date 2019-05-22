package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
       int year =scanner.nextInt();
       int x=365;
       int y=366;
       String str = "количество дней в году: ";
       if(year%400==0){
           System.out.println(str+y);
       }
       else if(year%100==0){
           System.out.println(str+x);
       }
        else if(year % 4 == 0){
           System.out.println(str+y);
       }
       else{
           System.out.println(str+x);
       }
    }
}