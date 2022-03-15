package inheritanceConcept;

public class B extends A {

    @Override
    public void aClass(){
        System.out.println("This is B class");
    }

    @Override
    public void sayHello(){
        System.out.println("Hey Hello");
    }

    public static void printText(){
        System.out.println("Welcome");
    }


}
