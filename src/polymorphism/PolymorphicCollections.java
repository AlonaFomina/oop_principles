package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphicCollections {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        System.out.println("\n------------Cat Object----------\n");
        cat1.eat();
        cat1.sleep();
        cat1.eat("fish");

        Dog dog1 = new Dog();
        System.out.println("\n------------Dog Object----------\n");
        dog1.eat();
        dog1.sleep();
        dog1.eat("meat");


        System.out.println("\n------------Animal Object----------\n");
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.eat("some food");
        animal1.sleep();

        System.out.println("\n------------Cat and Dog Object----------\n");
        Animal cat2 = new Cat();
        cat2.eat();
        cat2.sleep();


        Animal dog2 = new Dog();
        dog2.eat();
        dog2.sleep();

        System.out.println("\n------------Array collection of Animals and ArrayList----------\n");
        Animal[] animals1 = {cat1,cat2,dog1,dog2,animal1};

        ArrayList<Animal> animals  = new ArrayList<>(Arrays.asList(animals1));
        animals.forEach(Animal::eat);
        //new ArrayList<>(Arrays.asList(animals1).forEach(Animal::eat));


        for (Animal animal : animals) {
            animal.eat();
            //System.out.println(animal.getClass().getSimpleName());


        }
    }
}
