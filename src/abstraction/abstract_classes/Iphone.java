package abstraction.abstract_classes;

public class Iphone extends Phone implements  Camera,Bluetooth{
    public Iphone(){

    }   public static final String OS= "IOS";

    public Iphone(String brand, String colour, int storage, double price) {
        super(brand, colour, storage, price);
    }

    @Override
    public void call() {
        System.out.println("Iphone calls");
    }

    @Override
    public void ring() {
        System.out.println("Iphone rings");
    }

    @Override
    public void text() {
        System.out.println("Iphone texts");
    }

    @Override
    public boolean isConvertible() {
        return true;
    }


    @Override
    public void takesPhoto() {
        System.out.println("Iphone takes photos");
    }

    @Override
    public void connectBlueTooth() {
        System.out.println("Iphone connects to bluetooth");
    }
}
