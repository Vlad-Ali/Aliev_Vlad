package Zoo;

public abstract class Food{
    protected final String Type;
    public Food(String Type){
        this.Type=Type;
    }
    public String GetType(){
        return this.Type;
    }
    public abstract String GetName();
}
