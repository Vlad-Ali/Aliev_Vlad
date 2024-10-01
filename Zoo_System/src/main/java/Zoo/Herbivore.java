package Zoo;

import java.util.HashSet;

public abstract class Herbivore extends Animal {
    protected final String foodType;
    protected HashSet<String> ListOfFood;
    public Herbivore(String name) {
        super(name);
        this.foodType = "Grass";
        this.ListOfFood=new HashSet<>();
    }
    public void IsFood(Food food){
        if (food.GetType()==this.foodType){
            if (ListOfFood.contains(food.GetName())){
                System.out.println(this.Name+" is eating");
                return;
            }
        }
        System.out.println(food.GetName()+ " is not a food for "+this.Name);
    }
}
