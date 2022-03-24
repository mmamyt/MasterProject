package Interface;

public class ClassTwo extends ClassOne implements ITwo{

    public static void main(String[] args) {
        ClassTwo ct2 = new ClassTwo();
        ct2.print("John Smith");
    }

    @Override
    public void printNumber(int number) {

    }

    @Override
    public void printNumber(int numberFrom, int numberTo) {

    }

    @Override
    public void printNumber(int number, String star) {

    }

    @Override
    public void printNumber() {

    }
}
