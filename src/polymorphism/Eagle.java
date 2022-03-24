package polymorphism;

public class Eagle extends Bird{

    @Override
    public void canFly(){
        System.out.println("It surely can fly");
    }
    public static void eat(){
        System.out.println("Eagle eats meat");
    }

}
