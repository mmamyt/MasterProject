package polymorphism;

public class Penguin extends Bird{

    @Override
    public void canFly() {
        System.out.println("Penguin cannot fly");
    }

    public static void eat(){
        System.out.println("Penguin eats fish");
    }

}
