package abstraction.abstract_classes;

public class Samsung extends Phone{
    public Samsung(){

    }
    public static final String OS= "Android";
    public Samsung(String brand, String colour, int storage, double price) {
        super(brand, colour, storage, price);
    }

    @Override
    public void call() {
        System.out.println("Samsung calls");
    }

    @Override
    public void ring() {
        System.out.println("Samsung rings");
    }

    @Override
    public void text() {
        System.out.println("Samsung texts");
    }

    @Override
    public boolean isConvertible() {
        return true;
    }
}
