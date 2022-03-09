package constructorCOM;

public class Applicants {
    public static void main(String[] args) {

        Human john;
        john = new Human("John", "Smith");
        System.out.println(john.firstName + " " + john.lastName);

        john = new Human(38);
        System.out.println(john.age);

        john = new Human("brown");
        System.out.println(john.eyeColor);

        john.isEmployed = true;
        System.out.println(john.isEmployed);

        Human bob = new Human();
        bob.firstName = "Bob";
        bob.lastName = "Marley";
        bob.age = 77;
        bob.isEmployed = false;
        System.out.println(bob.firstName +" "+ bob.lastName + " " +bob.age +" "+ bob.isEmployed);

    }
}
