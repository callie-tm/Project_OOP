package animals;

public class Dog extends Pet{
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void sound() {
        System.out.println("Gau Gau");
    }
}

