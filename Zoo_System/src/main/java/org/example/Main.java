package org.example;

public class Main {
    public static void main(String[] args) {
        Horse horse=new Horse();
        Camel camel=new Camel();
        Eagle eagle=new Eagle();
        Dolphin dolphin=new Dolphin();
        Tiger tiger=new Tiger();
        Zoo.Move(horse);
        Zoo.Move(camel);
        Zoo.Move(eagle);
        Zoo.Move(dolphin);
        Zoo.Move(tiger);
        Food lamb=new Food("meat","lamb");
        Food fish=new Food("meat","fish");
        Food grass=new Food("grass","grass");
        Zoo.Eating(horse,lamb);
        Zoo.Eating(horse,fish);
        Zoo.Eating(horse,grass);
        Zoo.Eating(camel,lamb);
        Zoo.Eating(camel,fish);
        Zoo.Eating(camel,grass);
        Zoo.Eating(eagle,lamb);
        Zoo.Eating(eagle,fish);
        Zoo.Eating(eagle,grass);
        Zoo.Eating(dolphin,lamb);
        Zoo.Eating(dolphin,fish);
        Zoo.Eating(dolphin,grass);
        Zoo.Eating(tiger,lamb);
        Zoo.Eating(tiger,fish);
        Zoo.Eating(tiger,grass);
    }
}