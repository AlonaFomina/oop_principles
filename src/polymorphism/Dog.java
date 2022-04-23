package polymorphism;

public class Dog extends Animal{
  public void bark(){
      System.out.println("Dog barks");
  }

    @Override
    public void eat() {
        System.out.println("Dog eats");;
    }

    @Override
    public void eat(String s) {
        System.out.println("Dog eats " + s);
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");;
    }
    public void sleep(int hour) {
        System.out.println("Dog sleeps " + hour + " hours");;
    }
}
