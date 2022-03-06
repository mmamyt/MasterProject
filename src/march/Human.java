package march;

public class Human {
    //eat, speak, walk, talk, run

    static void eat(){
        System.out.println("Lunch");
    }

    static void walk(){
        System.out.println("walk");
    }

    static void speak(){
        System.out.println("speak");
    }

    static void talk(){
        System.out.println("talk");
    }

    static void run(){
        System.out.println("run");
    }

    public static void main(String[] args) {
        eat();
        speak();
        talk();
        run();
        walk();
    }

}
