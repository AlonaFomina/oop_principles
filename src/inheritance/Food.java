package inheritance;

public class Food {
    public String taste;
    protected String  name;
    boolean isSpicy;
    private boolean isOrganic;
    public static final boolean isTangible = true;

    public boolean isOrganic() {
        return isOrganic;
    }

    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }

    @Override
    public String toString() {
        return "Food{" +
                "taste='" + taste + '\'' +
                ", name='" + name + '\'' +
                ", isSpicy=" + isSpicy +
                ", isOrganic=" + isOrganic +
                '}';
    }
}
