package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(1);
        int a = 1;
        int b = 2;
        int count = 1;
        while(count < 5) {
            a = a + b;
            b++;
            count++;
            System.out.println(a);
        }

    }
}
