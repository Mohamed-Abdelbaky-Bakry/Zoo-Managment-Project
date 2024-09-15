package zoo;

import animals.Animal;
import animals.Elephant;
import animals.Lion;
import animals.Rat;

public class Main {
    public static void main(String[] args) {

        Animal simba = new Lion("Simba", 15,true);
        Animal dumbo = new Elephant("Dumbo", 15 ,22);
        Animal jerry = new Rat ("jerry",15,"yellow");


        zoo.ZooKepear zooKepear = new zoo.ZooKepear();
        zooKepear.feedAnimal(simba,"meat",20);
        zooKepear.feedAnimal(dumbo,"grass",20);
        zooKepear.feedAnimal(jerry,"carrot",20);
    }
}
