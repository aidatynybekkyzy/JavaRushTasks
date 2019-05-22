package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String name1 =scanner.next();
        String name2 =scanner2.next();
        if(name1.equalsIgnoreCase(name2)){
            System.out.print("Имена идентичны");
        }
        else if(name1 != name2 && name1.length()==name2.length()){
            System.out.println("Длины имен равны");
        }

    }
}
