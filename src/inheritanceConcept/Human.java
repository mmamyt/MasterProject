package inheritanceConcept;

public class Human {
    static String firstName;
    static String secondN;
    int age;
    char gendar;
    String email;
    String adress;
    double weight;
    public Human (String firstName, String secondN){
        this.firstName = firstName;
        this.secondN = secondN;
    }

    public Human(int age,char gendar){
        this.age = age;
        this.gendar = gendar;
    }
    public String getEmail(){
        return email;
    }
    public String GetAdress(){
        return adress;
    }
    public Human(){
    }
    public static  void printName (){
        System.out.println(firstName + " " + secondN);
    }
}