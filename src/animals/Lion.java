package animals;

public class Lion extends animals.Animal {
    private  boolean isMale;
    public Lion(String name, int age, boolean isMale){
        super(name, age);
        this.isMale = isMale;
    }

    @Override
    public void eat() {
        System.out.println("The lion eats meat");
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void roar() {
        System.out.println("The lion roars loudly.");
    }

    public boolean isMale() {
        return isMale;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "isMale=" + isMale +
                '}';
    }
}
