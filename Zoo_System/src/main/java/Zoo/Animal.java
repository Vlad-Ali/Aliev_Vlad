package Zoo;


public abstract class Animal{
    protected final String Name;
    public Animal(String name){
        this.Name=name;
    }
    public abstract void IsFood(Food food);
    public String GetName(){
        return this.Name;
    }
}
