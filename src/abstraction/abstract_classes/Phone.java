package abstraction.abstract_classes;


public abstract class Phone {
    public Phone(){

    }
    public abstract void  call();
    public abstract void ring();
    public abstract void text();
    public abstract boolean isConvertible();

    public String brand;
    public String colour;
    public int storage;
    public double price;

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", storage=" + storage +
                ", price=" + price +
                '}';
    }

    public Phone(String brand, String colour, int storage, double price) {
        this.brand = brand;
        this.colour = colour;
        this.storage = storage;
        this.price = price;
    }
}
