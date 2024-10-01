package Zoo;

public class Grass extends Food {
    protected final String Name;
    public Grass(String name) {
        super("Grass");
        this.Name = name;
    }
    public String GetName(){
        return this.Name;
    }
}
