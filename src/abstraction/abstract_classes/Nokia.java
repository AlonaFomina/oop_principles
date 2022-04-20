package abstraction.abstract_classes;

public class Nokia  extends Phone{
    public Nokia(){
    }
    public static final String OS= "Android";
    public Nokia(String brand, String colour, int storage, double price) {
        super(brand, colour, storage, price);
    }

    @Override
    public void call() {
        System.out.println("Nokia calls");
    }

    @Override
    public void ring() {
        System.out.println("Nokia rings");
    }

    @Override
    public void text() {
        System.out.println("Nokia texts");
    }

    @Override
    public boolean isConvertible() {
        return false;
    }
}
