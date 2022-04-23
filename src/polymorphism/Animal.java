package polymorphism;

public class Animal {

    public void eat(){
        System.out.println("Animal eats");
    }
    public void sleep(){
        System.out.println("Animal sleeps");
    }
    public void eat(String s){
        System.out.println("Animal eats " + s);
    }
}
