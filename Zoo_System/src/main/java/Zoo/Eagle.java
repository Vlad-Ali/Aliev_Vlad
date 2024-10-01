package Zoo;


public class Eagle extends Predator implements flying {
    public Eagle() {
        super("Eagle");
        this.ListOfFood.add("fish");
        this.ListOfFood.add("beef");
    }
    @Override
    public void fly(){
        System.out.println("Eagle is flying");
    }
    @Override
    public void IsFood(Food food) {
        super.IsFood(food);
    }

    public String GetName(){
        return "Eagle";
    }
}
