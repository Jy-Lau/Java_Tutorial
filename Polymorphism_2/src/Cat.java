public class Cat extends Animal {
    //from abstract class method
    @Override
    void printSomething() {
        System.out.println("Hello World");
    }
    //from interface
    @Override
    public void befriendly() {
        System.out.println("I am friendly");
    }

    @Override
    public void beplayFul() {
        System.out.println("I am playful");
    }

    @Override
    public int returnInteger() {
        return 0;
    }

    @Override
    public String returnString() {
        return "A String";
    }
}
