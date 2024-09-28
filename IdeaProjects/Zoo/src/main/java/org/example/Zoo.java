package org.example;

public class Zoo{
    public static void Move(Animal animal){
        System.out.println(animal.NameOfAnimal+" "+animal.Action);
    }
    public static void Eating(Animal animal, Food food){
        if (animal.isFood(food)){
            System.out.println(animal.NameOfAnimal+" is eating");
        }
        else{
            System.out.println(food.getName() +" is not a food for "+animal.NameOfAnimal);
        }
    }
}
