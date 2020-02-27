public class Dog extends Animal {

    @Override
    public int getAge() {
        return 5;   //child class modify base class's value
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean isNaughty() {
        return super.isNaughty();
    }

    @Override
    public void printSomething() {
        System.out.println("Hello from Child Class");   //child class modify base class's value
    }
}
