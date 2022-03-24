package Interface;

public class PrintNumber implements ITwo{
    @Override
    public void printNumber(int number) {
        for(int i = 0; i < number; i++){
            System.out.print(i + "; ");
        }
    }

    @Override
    public void printNumber(int numberFrom, int numberTo) {

        for(int i = numberFrom; i < numberTo; i++){
            System.out.print(i + "; ");
        }
    }

    @Override
    public void printNumber(int number, String star) {
        for(int i=0; i <= number; i++) {
            System.out.print(star);
        }
    }

    @Override
    public void printNumber() {
        System.out.println(10);
    }

    public static void main(String[] args) {
        PrintNumber numb = new PrintNumber();
        numb.printNumber(10);
        System.out.println();
        numb.printNumber(5, 9);
        System.out.println();
        numb.printNumber(5, "*");

    }
}
