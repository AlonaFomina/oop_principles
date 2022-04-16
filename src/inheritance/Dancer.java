package inheritance;

public class Dancer extends Person{
    public Dancer(){

    }
    public Dancer(String fName, String lName, int age, String gender) {
        super(fName, lName, age, gender);
    }
    public void dance(){
        System.out.println("dancer dance");
    }
}
