package abstraction;

public abstract class Animal {

    public abstract void makeSound();
    public abstract void canFly();
    public abstract void sleep();
    public abstract void walk();
    public abstract void eat();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


}
