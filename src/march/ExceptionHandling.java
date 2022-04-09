package march;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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



       try {
            System.out.print("Enter a name: ");
            String name = sc.nextLine();
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            System.out.println("You entered: " + name + "\nEntered age " + age);
        } catch(InputMismatchException e){
            System.out.println("Something went wrong " + e);
        }


/*        try {
            System.out.print("Enter number one: ");
            int numOne = sc.nextInt();
            System.out.print("Enter number two: ");
            int numTwo = sc.nextInt();
            int result = numOne / numTwo;
            System.out.println(result);
        } catch(Exception e){
            System.out.println("Something is wrong " + e);
        } finally{
            System.out.println("Finally is executed");
        }*/

    }
}
