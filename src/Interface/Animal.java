package Interface;

public interface Animal {
    //public and abstract are redundant for interface
    public abstract void makeSound();
    void sleep();
    void eat();
    boolean fly();
    String name(String name);


}
