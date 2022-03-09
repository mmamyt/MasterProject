package constructorCOM;

public class Human {

    //state or attributes
    public int age;
    public String firstName;
    public String lastName;
    public long cellNumber;
    public double weight;
    public double height;
    public String eyeColor;
    public char gender;
    public boolean isEmployed;

    //constructor here would help to initialize values for values
    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Human(int age){
        this.age = age;
    }

    public Human(long cellNumber){
        this.cellNumber = cellNumber;
    }

    public Human (double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public Human(char gender){
        this.gender = gender;
    }

    public Human(boolean isEmployed){
        this.isEmployed = isEmployed;
    }

    public Human(String eyeColor){
        this.eyeColor = eyeColor;
    }

    public Human(){
    }

}
