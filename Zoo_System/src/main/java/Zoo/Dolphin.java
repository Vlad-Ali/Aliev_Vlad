package Zoo;


public class Dolphin extends Predator implements swimmig {
    public Dolphin() {
        super("Dolphin");
        this.ListOfFood.add("fish");
    }
    @Override
    public void swim(){
        System.out.println("Dolphin is swimmig");
    }

    @Override
    public void IsFood(Food food) {
        super.IsFood(food);
    }

    public String GetName(){
        return "Dolphin";
    }
}
