package org.example;

public class Animal {
    protected final String FoodType;
    protected final String Ability;
    protected final String ClassOfFood;
    protected final String[] FoodConsumed;
    protected final String NameOfAnimal;
    protected final String Action;
    public Animal(String foodType, String ability, String classOfFood, String[] foodConsumed, String nameOfAnimal,String action){
        this.FoodType=foodType;
        this.Ability=ability;
        this.ClassOfFood = classOfFood;
        this.FoodConsumed = foodConsumed;
        this.NameOfAnimal = nameOfAnimal;
        this.Action=action;
    }
    public String GetAbility(){
        return this.Ability;
    }
    public String GetFoodType(){
        return this.FoodType;
    }
    public boolean isFood(Food food){
        if (this.ClassOfFood==food.getType()){
            for(String i : this.FoodConsumed){
                if (i.equals(food.getName())){
                    return true;
                }
            }
        }
        return false;
    }
}
