package encapsulation;

public class Car {
    public String make;
    private  int year;
    private double price; //require password
    private boolean isConvertible = true;//


    //providing indirect access to year to set and get info
    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(String password, String email) {
        if(email.equals("abc123@gmail.com") && password.equals("12345678")) return price;
        else throw  new RuntimeException("The password entered is not valid");
    }
    public boolean getIsConvertible(){
        return isConvertible;
    }
}
