package inheritanceConcept;

public class ChildOne extends Parent {
    public static void main(String[] args) {
        printName("John");
        printAge(34);
        singSong1();
        singSong2();

    }

    public static void singSong2(){
        System.out.println("... Little Star");
    }
}
