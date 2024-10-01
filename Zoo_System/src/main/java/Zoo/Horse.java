package Zoo;


public class Horse extends Herbivore implements walking {
    public Horse() {
        super("Horse");
        this.ListOfFood.add("grass");
    }
    public String GetName(){
        return "Horse";
    }

    @Override
    public void walk() {
        System.out.println("Horse is walking");
    }

    @Override
    public void IsFood(Food food) {
        super.IsFood(food);
    }
}
