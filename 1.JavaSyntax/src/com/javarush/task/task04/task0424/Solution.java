package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        if((num==num2)&&(num!=num3)){
            System.out.println(3);
        } else if((num2==num3)&&(num2!=num)){
            System.out.println(1);
        }
        else if (num==num3&&num!=num2){
            System.out.print(2);
        }

    }
}
