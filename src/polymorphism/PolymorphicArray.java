package polymorphism;

import java.util.ArrayList;

public class PolymorphicArray {
    public static void main(String[] args) {
        Object[] elements = {5,5.6,"*","Alex",true,new Dog(),new ArrayList<>()};

        for (Object element : elements) {
            System.out.println(element);
        }

        Dog dog1 = (Dog)elements[5];
        dog1.sleep(9);

        String name = (String) elements[3];
        System.out.println(((String) elements[3]).startsWith("A"));
    }
}
