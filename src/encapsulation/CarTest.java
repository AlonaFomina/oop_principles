package encapsulation;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();

        //Setting info foe make
        car1.make = "BMW";
        //getting info of make

        System.out.println(car1.make);
        //setting info for year
        car1.setYear(2015);

        //Getting info
        System.out.println(car1.getYear());

        car1.setPrice(5000);
        System.out.println(car1.getPrice("12345678","abc123@gmail.com"));

        System.out.println(car1.getIsConvertible());
    }
}
