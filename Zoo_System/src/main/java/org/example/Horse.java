package org.example;

public class Horse extends Animal{
    public Horse() {
        super("herbivorous", "land","grass",new String[]{"grass"},"Horse","is walking");
    }
    public String GetName(){
        return "Horse";
    }
}
