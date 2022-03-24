package Interface;

public class Cat implements Animal, Animal2{
    @Override
    public void makeSound() {
        System.out.println("Meow-meow");
    }

    @Override
    public void sleep() {
        System.out.println(22);
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public String name(String name) {
        return name;
    }

    @Override
    public boolean domestic(boolean YN) {
        return YN == true;
    }

    @Override
    public boolean playful(boolean YN) {
        return YN == true;
    }

    @Override
    public boolean friendly(boolean YN) {
        return YN == true;
    }
}
