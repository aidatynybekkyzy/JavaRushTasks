package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    //напишите тут ваш код
String name;
int height;
String color;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {
Dog dog1 = new Dog ();
Dog dog2 = new Dog ();
Dog dog3 = new Dog ();
dog1.initialize("dog1");
dog2.initialize("dog1",12);
dog3.initialize("dog1",12,"black");
    }
}
