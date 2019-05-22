package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg = new Zerg();
        zerg.name="First";
        Zerg zerg1 = new Zerg();
        zerg1.name="Second";
        Zerg zerg2 = new Zerg();
        zerg2.name="Third";
        Zerg zerg3 = new Zerg();
        zerg3.name="Fourth";
        Zerg zerg4 = new Zerg();
        zerg4.name="Fifth";
         Protoss protoss=new Protoss();
         protoss.name="One";
        Protoss protoss2=new Protoss();
        protoss2.name="Two";
        Protoss protoss3=new Protoss();
        protoss3.name="Three";
        Terran terran= new Terran();
        terran.name="Terran1";
        Terran terran2= new Terran();
        terran2.name="Terran2";
        Terran terran3= new Terran();
        terran3.name="Terran3";
        Terran terran4= new Terran();
        terran4.name="Terran4";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
