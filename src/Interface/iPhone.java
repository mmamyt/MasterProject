package Interface;

public class iPhone implements Phone{

    @Override
    public void text() {
        System.out.println("typing");
    }

    @Override
    public void call() {
        System.out.println("missed callzzzz");
    }

    @Override
    public void ring() {
        System.out.println("ringing");
    }

    public static void main(String[] args) {
        iPhone ip = new iPhone();
        ip.text();
        ip.call();
        ip.ring();
    }
}
