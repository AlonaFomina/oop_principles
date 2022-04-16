package encapsulation;

import java.util.Scanner;

public class CompanyTest {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Company company1 = new Company();
        Company company2 = new Company();


        company1.setName("Apple");
        company1.setAddress("California");
        company1.setPhone("(123) 312-2345");
        System.out.println("Company 1 is = " + company1.getName());
        System.out.println(company1);



        company2.setName("Google");
        company2.setAddress("California");
        company2.setPhone("(000) 312-2345");
        System.out.println("Company 2 is = " + company2.getName());
        System.out.println(company2);

        System.out.println("Company 1 is = " +"\"" + company1.getName() + "\" and company 2 is = \"" + company2.getName() + "\"");
    }
}
