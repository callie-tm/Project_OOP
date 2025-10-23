package animals;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Cat ("Lucky", 3));
        pets.add(new Cat ("Kitty", 2));

        for (Pet pet: pets) {
            pet.displayInfo();
            pet.sound();
            System.out.println();

        }
        
        
    }
}
