package reviewClasses;

import java.util.Scanner;

public class MethodReview {

    Scanner sc = new Scanner(System.in);

    public void addTwoNumbers(int x, int y){
        System.out.println(x+y);
    }

    public void login(String username, String password){
        //enter username
        //enter password
    }

    public void navigate(String url){

    }

    public void testCase02(){
        MethodReview mr = new MethodReview();

        mr.navigate("www.orange.com");
        mr.login("admin", "admin123");
    }

    public boolean checkAge(){
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age >=18){
            return true;
        } else return false;
    }

    public String pageTitle(String element){
        //get text from UI page
        return element;
    }


    public static void main(String[] args) {
        MethodReview mr = new MethodReview();
        mr.addTwoNumbers(4545, 2343);

        mr.navigate("www.orange.com");
        mr.login("admin", "admin123");

        boolean age = mr.checkAge();
        System.out.println(age);

        String pt = mr.pageTitle("LoginPage Title");
        System.out.println(pt);
    }




}
