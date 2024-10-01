package Zoo;

public class Camel extends Herbivore implements walking {
    public Camel() {
        super("Camel");
        this.ListOfFood.add("grass");
    }

    @Override
    public void IsFood(Food food) {
        super.IsFood(food);
    }
    @Override
    public void walk() {
        System.out.println("Camel is walking");
    }
}
