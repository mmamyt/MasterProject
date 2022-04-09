package march;

import java.util.Scanner;

public class IgnoreExceptions {

    int age;
    public void setAge(int age) throws Exception{
        if(age< 0 || age > 120){
            throw new Exception(">>> Invalid age <<<");
        }
        System.out.println(this.age=age);
    }

    public static void main(String[] args) throws Exception{
        IgnoreExceptions ig = new IgnoreExceptions();
        ig.setAge(122);
        System.out.println(ig.age);


    }
}
