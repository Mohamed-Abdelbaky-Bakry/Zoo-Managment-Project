package zoo;

import animals.Animal;

public class ZooKepear {

    public void feedAnimal(Animal animal,String foodType, int amount){
        System.out.println(animal.getName()+" is eating "+amount+" kg of "+foodType);
    }
}
