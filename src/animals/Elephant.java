package animals;

public class Elephant extends animals.Animal {
    private float trunkLength;

    public Elephant(String name, int age, float trunkLength) {
        super(name, age);
        this.trunkLength = trunkLength;
    }

    public void setTrunkLength(float trunkLength) {
        this.trunkLength = trunkLength;
    }

    @Override
    public void eat() {
        System.out.println("The elephant eats grass");
    }

    public void trumpets() {
        System.out.println("The elephant trumpets loudly.");
    }

    public float getTrunkLength() {
        return trunkLength;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "trunkLength=" + trunkLength +
                '}';
    }
}
