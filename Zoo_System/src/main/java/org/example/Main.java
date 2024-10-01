package org.example;
import Zoo.*;

public class Main {
    public static void main(String[] args) {
        Camel camel=new Camel();
        Dolphin dolphin=new Dolphin();
        Eagle eagle =new Eagle();
        Horse horse=new Horse();
        Tiger tiger=new Tiger();
        Grass grass=new Grass("grass");
        Meat beef=new Meat("beef");
        Meat fish=new Meat("fish");
        camel.IsFood(grass);
        camel.IsFood(beef);
        camel.IsFood(fish);
        camel.walk();
        dolphin.IsFood(grass);
        dolphin.IsFood(beef);
        dolphin.IsFood(fish);
        dolphin.swim();
        eagle.IsFood(fish);
        eagle.IsFood(beef);
        eagle.IsFood(grass);
        eagle.fly();
        horse.IsFood(fish);
        horse.IsFood(beef);
        horse.IsFood(grass);
        horse.walk();
        tiger.IsFood(fish);
        tiger.IsFood(grass);
        tiger.IsFood(beef);
        tiger.walk();
    }
}