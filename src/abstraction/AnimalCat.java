package abstraction;

public class AnimalCat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Meow meow");
    }

    @Override
    public void canFly(){
        System.out.println("Cat cannot fly!");
    }

    public static void main(String[] args) {
        AnimalCat myCat = new AnimalCat();
        myCat.makeSound();
        myCat.canFly();
    }

}