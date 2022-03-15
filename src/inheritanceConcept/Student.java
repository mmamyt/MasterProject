package inheritanceConcept;

public class Student extends Human{
    public static void main(String[] args) {

        Human Student ;
        Student = new Human("John ", "Smith");
        Student.age = 21;
        Student.adress = "123 main str City 34567";
        Student.email = "student@gmail.com";
        Student.weight = 45;
        printName();
    }
}