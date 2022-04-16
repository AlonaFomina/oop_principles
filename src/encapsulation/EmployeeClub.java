package encapsulation;

import java.util.Scanner;

public class EmployeeClub {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Employee emp = new Employee();



        System.out.println("Hey, what is your full name?");
        emp.setFullName(userInput.nextLine());

        System.out.println("And, the age please");
        emp.setAge(userInput.nextInt());

        userInput.nextLine();

        System.out.println("Lastly, address please");
        emp.setAddress(userInput.nextLine());

        System.out.println(emp);

        if (emp.getAddress().toLowerCase().contains("chicago") && emp.getAge() > 21){
            System.out.println(emp.getFullName() + " is in the club");
        }
        else System.out.println(emp.getFullName() + " is not in the club");
    }
}
