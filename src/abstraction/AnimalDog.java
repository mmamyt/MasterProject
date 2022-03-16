package abstraction;

public class AnimalDog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Woof woof");
        canFly();
    };

    @Override
    public void canFly(){
        //always refers to super class
        super.eat();
        System.out.println("Dog cannot fly!");
    };

    public static void main(String[] args) {
        AnimalDog dd = new AnimalDog();
        dd.makeSound();
        dd.canFly();

    }
}
