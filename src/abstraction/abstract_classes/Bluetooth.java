package abstraction.abstract_classes;

public interface Bluetooth {
    void connectBlueTooth();
    static int getYear(){
    return 2022;
    }
    default boolean isConnected(){
        return true;
    }
}
