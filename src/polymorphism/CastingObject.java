package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class CastingObject {
    public static void main(String[] args) {

        Cat cat1 = new Cat();//no casting
        /*
        Upcasting - putting smaller data in bigger
        - it is happens implicitly
         */

        Animal animal1 = new Cat();//upCasting cuz of cat in the shape of animal
        Object object1 = new Cat(); //upcasting cat in the shape of Object
        List<Animal> animals = new ArrayList<>(); //upCasting cuz ArrayList in the shape of a List

        /*
        downCasting - its putting bigger data in the smaller, and it's happened explicitly
        there could be a data loss primitives
        there can be thrown with object if done  improperly
         */
        /*
        Dog dog1 = (Dog) new Animal();//every animal is a dog and this is false
        //System.out.println(dog1);
        Immediate use of down-casting is not possible, and you will get a ClassCatException
         */

        Animal a1 = new Dog();//this is a dog in the shape of animal which is upcasted
        Dog dog1 = (Dog) a1;
        a1.eat();//dog eat
        dog1.eat();// dog eat
        System.out.println(dog1.getClass().getSimpleName());

    }
}
