package inheritance;

import package5.Singer;

import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person();
        System.out.println(person1.fName = "John");
        System.out.println(person1.lName = "Doe");
        System.out.println(person1.age = 15);
        System.out.println(person1.gender = "Male");
        person1.setDOB("01/01/2020");
        System.out.println(person1.getDOB());
        person1.setSSN("000-000-000");
        System.out.println(person1.getSSN());

        Person person2 = new Person("Daria", "Syvak", 27, "female");
        person2.setSSN("555 -55-5555");
        person2.setDOB("01/01/2020");

       Tester tester1 = new Tester();
        System.out.println(tester1.fName = "John");
        System.out.println(tester1.lName = "Doe");
        System.out.println(tester1.age = 15);
        System.out.println(tester1.gender = "Male");
        tester1.setDOB("01/01/2020");
        System.out.println(tester1.getDOB());
        tester1.setSSN("000-000-000");
        System.out.println(tester1.getSSN());

        Tester tester2 = new Tester("Yung", "Kim", 20, "Male");
        tester2.setSSN("555 -55-5555");
        tester2.setDOB("01/01/2020");

       Singer singer1 = new Singer();
        System.out.println(singer1.fName = "Abe");
        System.out.println(singer1.lName = "kim");
        System.out.println(singer1.age = 22);
        System.out.println(singer1.gender = "Male");
        singer1.setDOB("01/01/2000");
        System.out.println(singer1.getDOB());
        singer1.setSSN("000-011-1100");
        System.out.println(singer1.getSSN());
        Singer singer2 = new Singer("Yung", "Kim", 20, "Male");
        singer2.setSSN("555 -55-5555");
        singer2.setDOB("01/01/2020");

       Dancer dancer1 = new Dancer();
        System.out.println(dancer1.fName = "Alona");
        System.out.println(dancer1.lName = "Q");
        System.out.println(dancer1.age = 27);
        System.out.println(dancer1.gender = "Female");
        dancer1.setDOB("01/01/2020");
        System.out.println(dancer1.getDOB());
        dancer1.setSSN("000-000-000");
        System.out.println(dancer1.getSSN());
        Dancer dancer2 = new Dancer("Yung", "Kim", 20, "Male");
        dancer2.setSSN("555 -55-5555");
        dancer2.setDOB("01/01/2020");

        System.out.println("Person 1:" + person1.fName + " "+ person1.lName +
                ", " + person1.age + ", " + person1.gender +
                ", " + person1.getDOB() + ", " + person1.getSSN());

        System.out.println("Tester 1:" + tester1.fName + " "+ tester1.lName +
                ", " + tester1.age + ", " + tester1.gender +
                ", " + tester1.getDOB() + ", " + tester1.getSSN());

        System.out.println("Singer 1:" + singer1.fName + " "+ singer1.lName +
                ", " + singer1.age + ", " + singer1.gender +
                ", " + singer1.getDOB() + ", " + singer1.getSSN());

        System.out.println("Dancer:" + dancer1.fName + " "+ dancer1.lName +
                ", " + dancer1.age + ", " + dancer1.gender +
                ", " + dancer1.getDOB() + ", " + dancer1.getSSN());

        System.out.println(person1);
        System.out.println(tester1);
        System.out.println(singer1);
        System.out.println(dancer1);
        System.out.println(person2);
        System.out.println(tester2);
        System.out.println(singer2);
        System.out.println(dancer2);


        System.out.println("\n--------------Person ArrayList-----------\n");
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person2);
        personList.add(person1);
        personList.add(tester1);
        personList.add(tester2);
        personList.add(singer1);
        personList.add(singer2);

       personList.forEach(System.out::println);


       System.out.println("\n-------------- Person Array---------------\n");
       Person[] personArr = {person2,singer2,dancer2};

        for (Person person : personArr) {
            System.out.println(person);

        }

        tester1.code();
        dancer2.dance();
        singer1.sings();

    }
}
