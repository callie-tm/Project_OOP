package animals;

public abstract class Pet {
    String name;
    int age;
    public Pet(String name, int age) {
    this.name = name;
    this.age = age;}
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public abstract void sound();
}
