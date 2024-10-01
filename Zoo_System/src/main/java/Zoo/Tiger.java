package Zoo;

public class Tiger extends Predator implements walking {

    public Tiger() {
        super("Tiger");
        this.ListOfFood.add("beef");
    }
    public String GetName(){
        return "Tiger";
    }

    @Override
    public void walk() {
        System.out.println("Tiger is walking");
    }

    @Override
    public void IsFood(Food food) {
        super.IsFood(food);
    }
}
