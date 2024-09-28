package org.example;

public class Food {
    protected final String Type;
    protected final String Name;
    public Food(String type, String name){
        this.Type=type;
        this.Name=name;
    }
    public String getType(){
        return this.Type;
    }
    public String getName(){
        return this.Name;
    }
}
