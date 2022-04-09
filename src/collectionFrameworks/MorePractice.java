package collectionFrameworks;

import java.util.ArrayList;
import java.util.Scanner;

public class MorePractice {
    public static void main(String[] args) {

        //ask user to enter 10 words to store in ArrayList
        ArrayList<String> months = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i < 13; i++){
            System.out.print("Please enter month "+i+ ": ");
            String month = sc.nextLine();
            months.add(month);
        }
        System.out.println(months);

        //warm up task 2
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int i = 1;
        do {
            Scanner sc2 = new Scanner(System.in);
            System.out.print(i + " Enter any number: ");
            int userInput = sc2.nextInt();
            nums.add(userInput);
            i++;
        }while(i<=10);
        System.out.println(nums);




    }
}
