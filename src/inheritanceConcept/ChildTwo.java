package inheritanceConcept;

public class ChildTwo extends Parent {
    public static void main(String[] args) {
        printName("Bob");
        printAge(28);
        singSong1();
        skate();
    }

    public static void skate(){
        System.out.println("Bob is skating");
    }


}
