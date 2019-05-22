package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    //напишите тут ваш код
    String name;
    int age;
    char sex;
    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name,int age){
        this.name = name;
        this.age=age;
    }
    public void initialize(String name,int age, char sex){
        this.name = name;
        this.age=age;
        this.sex= sex;
    }

    public static void main(String[] args) {
Friend friend1 = new Friend();
Friend friend2 = new Friend();
Friend friend3 = new Friend();
friend1.initialize("Tom");
friend2.initialize("Tom",12);
friend3.initialize("Tom",12,'m');
    }
}
