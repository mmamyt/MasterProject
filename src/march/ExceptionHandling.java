package march;

public class ExceptionHandling {
    public static void main(String[] args) {

    /*    try {
            String str = "Hello";
            System.out.println(str.charAt(2));
            System.exit(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Finally is in run");
        }

        try{
            int[] numArr = {2,4,6,8,10};
            System.out.println(numArr[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch block's output is " + e.getMessage());
        }*/


        int a = 9, b = 6;
        int sum = a + b;
        String sumStr = String.valueOf(String.valueOf(sum).length());
        String aStr = String.valueOf(String.valueOf(a).length());
        if(sumStr.equals(aStr)){
            System.out.println(sum);
        } else System.out.println(a);


        int max = Math.max(Math.max(3, 9),6);

        System.out.println(max);
    }
}
