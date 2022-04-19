package inheritance;

public class Vegetable extends Food{
    public String colour;

    @Override
    public String toString() {
        return "Vegetable{" +
                "taste='" + taste + '\'' +
                ", name='" + name + '\'' +
                ", isSpicy=" + isSpicy +
                ",isOrganic=" + isOrganic() +
                ", colour='" + colour + '\'' +
                '}';
    }
}
