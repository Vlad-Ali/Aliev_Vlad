package org.example;

import java.util.HashSet;

public class Camel extends Animal{
    public Camel() {
        super("herbivorous", "land", "grass", new String[]{"grass"},"Camel","is walking");
    }
    public String GetName(){
        return "Camel";
    }
}
