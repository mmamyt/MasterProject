package abstraction;

public class Lion extends Feline{

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.setName("Simba");
        System.out.println(lion.getName());
        lion.makeSound();
        lion.canFly();
        lion.eat();
        lion.jump();
        lion.sleep();
        lion.selfish();
        lion.walk();
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "Roar - roar - roar");
    }

    @Override
    public void canFly() {
        System.out.println("Nope, i cannot fly but my friend does");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + "20 hours a day");
    }

    @Override
    public void walk() {
        System.out.println(getName() + "all day long");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "eats meat");
    }

    @Override
    public void selfish() {
        System.out.println(getName() + "is selfish");
    }

    @Override
    public void jump() {
        System.out.println(getName() + "is good jumper");
    }
}
