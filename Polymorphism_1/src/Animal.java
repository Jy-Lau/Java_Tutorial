public class Animal {
    private int age=10;
    private String name="Puppy";
    private boolean naughty=true;

    //Use Alt+Insert for Windows, Command+N for mac

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isNaughty() {
        return naughty;
    }

    public void printSomething(){
        System.out.println("Hello World");
    }
    //Method Overloading
    public void printSomething(String s){
        System.out.println(s);
    }
}
