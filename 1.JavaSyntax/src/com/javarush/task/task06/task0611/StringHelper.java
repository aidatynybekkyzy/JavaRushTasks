package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        int count = 5;
        while (count!=0){
            result = result+s;
            count--;
        }
return  result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //напишите тут ваш код
       while (count!=0){
       result = result+s;
           count--;
}

        return result;
    }

    public static void main(String[] args) {
 StringHelper stringHelper = new StringHelper();
        System.out.println(stringHelper.multiply("Aida",5));
        System.out.println("**********************************");
        System.out.println(stringHelper.multiply("aizirek"));
    }
}
