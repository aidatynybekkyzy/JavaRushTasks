package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            double number = Integer.parseInt(reader.readLine());
            double summa = 0;
            double cout = 0;
            while (number != -1){
                summa = summa + number;
                cout++;
                number = Integer.parseInt(reader.readLine());
            }
            System.out.println( (summa/cout));
        }catch ( ArithmeticException e){

        }


    }
}

/* double n =0;
        double sum =0;
        Scanner scanner = new Scanner(System.in);
        double number =scanner.nextInt();

        while (number!=1) {
            if (number<0){
                break;
            }

        }
        n++;
        sum+=number;
        double average = sum/n;
        System.out.println(average);
*/