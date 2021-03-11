import java.util.ArrayList;
import java.util.Collections
import java.util.List;

public class Pet {
    int age;
    String name;
    String color;


    public Pet(int petAge, String petName, String petColor){
        age = petAge;
        name = petName;
        color = petColor;
    }

    public static void main(String [] args){
        Pet pet1 = new Pet(7,"SaucyJoe", "Gray");
        Cat cat1= new Cat(7, "FloofMiester", "orange");
        pet1.speak();
        cat1.speak();
        System.out.println("Welcome to the animal Shelter");
        System.out.println("An animal has been thrust upon you, his name is Joe.");
        System.out.println("Press 1 to adopt a Cat, Press 2 to exit the shelter.");
        ArrayList <Pet> animalList = new ArrayList<Pet>();
        animalList.add(pet1);
        animalList.add(cat1);

    }

    public void speak(){
        System.out.println("I am an animal named Saucy Joe");
    }

    ArrayList <Pet> animalList = new ArrayList<Pet>();
    animalList.add(p);


}


