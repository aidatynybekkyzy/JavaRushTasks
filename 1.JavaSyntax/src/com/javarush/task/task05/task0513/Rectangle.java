package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width;
    int height;

    public void initialize (int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize (int left, int height) {
        this.left = left;
        this.height = height;
    }

    public void initialize (int height) {
        this.height = width;
    }
public void initialize (Rectangle rectangle){
    this.top = top;
    this.left = left;
    this.width = width;
    this.height = height;
}
    public static void main(String[] args) {
Rectangle rectangle1 = new Rectangle();
Rectangle rectangle2 = new Rectangle();
Rectangle rectangle3 = new Rectangle();
Rectangle rectangle4 = new Rectangle();
Rectangle rectangle5 = new Rectangle();
rectangle1.initialize(rectangle5);
rectangle2.initialize(12,14);
rectangle3.initialize(12);
rectangle4.initialize(12,12,12,12);
    }
}
