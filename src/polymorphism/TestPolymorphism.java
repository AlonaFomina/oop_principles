package polymorphism;

import java.util.LinkedList;
import java.util.List;

public class TestPolymorphism {
    public static void main(String[] args) {
        System.out.println("\n__________Testing Animal Object__________\n");

        Animal a1 = new Animal();
        a1.eat();
        a1.sleep();

        System.out.println("\n__________Testing Dog Object__________\n");
        Dog d1 = new Dog();
        d1.eat();
        d1.sleep();
        d1.bark();
        d1.sleep(6);

        System.out.println("\n__________Testing Dog Object In The Shape Of Animal__________\n");
        Animal a2 = new Dog();
        a2.sleep();
        a2.eat();
        a2.eat("food");


        LinkedList<String> l1 = new LinkedList<>();
        List<String> l2 = new LinkedList<>();

    }
}
