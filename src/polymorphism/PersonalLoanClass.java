package polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class PersonalLoanClass{
    public static void main(String[] args) {
        BankIR rate;

        rate = new BankIR();
        System.out.println(rate.getIR());

        rate = new BA();
        System.out.println(rate.getIR());

        rate = new ChaseBank();
        System.out.println(rate.getIR());

        rate = new Citibank();
        System.out.println(rate.getIR());

        //list is the parent
        List<Integer> listArray;
        listArray = new ArrayList<>();
        listArray = new LinkedList<>();
        listArray = new Vector<>();





    }
}
