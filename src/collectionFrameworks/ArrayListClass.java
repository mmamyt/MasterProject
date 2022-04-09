package collectionFrameworks;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {

/*        //regular/built array of sting
        String [] cars = {"Volvo", "BMW", "Benz", "Opel", "Tesla"};
        System.out.println(cars.length);
        for(String car : cars){
            System.out.print(car + " ");
        }
        System.out.println("\n>>>>>ArrayList<<<<<<");
        //Arraylist's size is dynamic
        ArrayList<String> cars2 = new ArrayList<String>(Arrays.asList(cars));
        cars2.add("Kia");
        cars2.add("Ford");
        System.out.println(cars2.size());
        System.out.println(cars2.get(3));
        System.out.println(cars2); //to print all elements of ArrayList
        cars2.set(0, "Jaguar");
        System.out.println(cars2.get(0));*/

        //create an ArrayList which can hold weekdays
        /*System.out.println("Weekdays");
        ArrayList <String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        System.out.println(days);
        System.out.println(days.get(5));
        days.set(5, "Weekend");
        days.set(6, "Weekend");
        System.out.println("After set " + days);

        //create an ArrayList that hold 7 numbers as int
        System.out.println("\nNumbers");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        System.out.println(numbers);
        numbers.set(3, 444);
        System.out.println(numbers);

        //create an ArrayList that hold chars
        System.out.println("\nChars");
        ArrayList<Character> chars = new ArrayList<Character>();
        chars.add('a');
        chars.add('b');
        chars.add('c');
        System.out.println(chars);
        System.out.println(chars.get(0));
        System.out.println(chars);
        //to clear all elements of Arraylist
        chars.clear();
        System.out.println(chars);

        //create an ArrayList that hold double
        System.out.println("\nDoubles");
        ArrayList<Double> doubles = new ArrayList<Double>();
        doubles.add(35.50);
        doubles.add(46.50);
        doubles.add(30.88);
        doubles.add(31.68);
        doubles.add(32.58);
        doubles.add(34.98);
        System.out.println(doubles);
        System.out.println(doubles.get(2));
        doubles.set(0, 44.44);
        System.out.println(doubles);
        //to get the size of the ArrayList
        System.out.println(doubles.size());
        for (int i = 0; i < doubles.size(); i+=2){
            doubles.set(i, 2.22);
        }
        System.out.println(doubles);

        System.out.println("\nString");
        ArrayList <String> names = new ArrayList<String>();
        names.add("Mika");
        names.add("Kamol");
        names.add("Anisa");
        names.add("AlyK");
        names.add("Aytan");
        names.add("Laman");
        names.add("Max");
        names.add("Merivan");
        names.add("Andrew");
        names.add("Nurlan");
        System.out.println(names);
        //sorting names
        Collections.sort(names);
        System.out.println(names);
*/
     ArrayList<String> alphabets = new ArrayList<>();



     String str = "";
     for(char c = 'A'; c <= 'Z'; c++){
         str = c + "" + Character.toLowerCase(c);
         alphabets.add(str);
     }
     System.out.println(alphabets);



    }
}
