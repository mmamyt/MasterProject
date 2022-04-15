package polymorphism;

public class DogClass extends Animal{

    public void getName(){
        super.getName();
        super.getInto();
        super.name = "Rex";
        System.out.println("This is a child class");
    }
    public void getInto(){
        System.out.println("This is child class info");
    }

    public static void main(String[] args) {
        DogClass dog = new DogClass();
        dog.getName();
    }
}
