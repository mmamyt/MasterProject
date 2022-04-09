package collectionFrameworks;

import java.util.LinkedList;

public class LinkedListIntro {
    public static void main(String[] args) {

        LinkedList <String> days = new LinkedList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        System.out.println(days);

        days.set(6, "Weekend");
        System.out.println(days);
        days.addFirst("MONDAY");
        days.addLast("SUNDAY");
        System.out.println(days);


/*        //create LinkedList called languages, then add 5 prog languages
        LinkedList<String> pl = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <=5; i++){
            System.out.print("Please enter programming language "+i+": ");
            String userInput = sc.nextLine();
            pl.add(userInput);
        }
        System.out.println(pl);
        System.out.println(pl.get(0));*/


        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(2);
        list.add(44);
        //methods that dont exist in ArrayList
        list.addFirst(1);
        list.addLast(10);
        //order matters
        list.add(34);
        System.out.println(list);
        System.out.println(list.getLast());
        list.removeLast();
        list.removeFirst();
        System.out.println(list);






    }
}
