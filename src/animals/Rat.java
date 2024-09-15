package animals;

public class Rat extends animals.Animal {
    private String color;

    public Rat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {

        System.out.println("The rat eats carrot");
    }
    public void runs(){
        System.out.println("the rat runs fast");
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "rat{" +
                "color='" + color + '\'' +
                '}';
    }
}
