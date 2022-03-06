package march;

public class Test02 {
    public static void main(String[] args) {
        Test01 tc = new Test01();
        tc.printHello();

        Test02.printNumber2();
    }

    public static void printNumber1(){
        System.out.println(20);
    }

    private static void printNumber2(){
        System.out.println(22);
    }


}
