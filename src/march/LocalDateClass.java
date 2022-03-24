package march;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class LocalDateClass {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonthValue());

        Date date2 = new Date();
        System.out.println(date2.getMonth());

       /* //ask user to enter month number/value
        //write java code to print associated month with the user's entry
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a month as a number: ");
        int monthNumber = sc.nextInt();
        switch(monthNumber){
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12:
                System.out.println(date.withMonth(monthNumber).getMonth());
                break;
                default:
                    System.out.println("Invalid month");
        }*/

        //local time
        LocalTime time = LocalTime.now();
        System.out.println(time);



    }
}