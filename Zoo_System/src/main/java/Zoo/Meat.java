package Zoo;

public class Meat extends Food {
    protected final String Name;
    public Meat(String name) {
        super("Meat");
        this.Name = name;
    }

    public String GetName(){
        return Name;
    }
}
