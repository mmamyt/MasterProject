package polymorphism;

public class MainMethod {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.canFly();
        Bird.eat();

        bird = new Eagle();
        bird.canFly();
        Eagle.eat();

        bird = new Penguin();
        bird.canFly();
        Penguin.eat();
    }
}
