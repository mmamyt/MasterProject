package collectionFrameworks;

import java.util.*;

public class HashSetClass {
    public static void main(String[] args) {

/*        //does not allow dupes and orders elements in ASC
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(5);
        System.out.println(set);

        HashSet<Character> setC = new HashSet<Character>();
        setC.add('a');
        setC.add('w');
        setC.add('z');
        setC.add('b');
        setC.add('c');

        System.out.println(setC);
        System.out.println(setC.size());*/

/*        SortedSet<String> word = new TreeSet<String>();
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <=8; i++) {
            System.out.print(i + " Please enter a word: ");
            String userInput = sc.nextLine();
            word.add(userInput);
        }
        System.out.println(word);*/

        ArrayList<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Monday");
        TreeSet<String> sortedDays = new TreeSet<String>();
        sortedDays.addAll(days);
        System.out.println(sortedDays);

    }
}
