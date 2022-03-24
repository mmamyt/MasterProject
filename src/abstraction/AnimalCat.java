package abstraction;

public class AnimalCat extends Feline{

    public static void main(String[] args) {
        AnimalCat cat = new AnimalCat();
        cat.setName("Tom");
        cat.makeSound();
        cat.canFly();
        cat.eat();
        cat.selfish();
        cat.sleep();
        cat.walk();
        cat.jump();
        cat.drinkMilk();
        cat.walk();
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " says meow - meow - meow");
    }

    @Override
    public void canFly() {
        System.out.println(getName() + " cannot fly");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 20 hours a day");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " walks in the balcony");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats a lot");
    }

    @Override
    public void selfish() {
        System.out.println(getName() + " is selfish sometimes");
    }

    @Override
    public void jump() {
        System.out.println(getName() + " can jump");
    }

    public void drinkMilk(){
        System.out.println(getName() + " drinks milk");
    }
}
