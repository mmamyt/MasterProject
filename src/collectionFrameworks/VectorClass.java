package collectionFrameworks;

import java.util.LinkedList;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {

        LinkedList<String> days = new LinkedList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        Vector <String> season = new Vector<String>();
        season.add("Spring");
        season.add("Summer");
        season.add("Fall");
        season.add("Winter");
        System.out.println(season);
        season.set(0, "SPRING");
        System.out.println(season);
        System.out.println(season.get(3));
        System.out.println(season.capacity());
        season.addAll(days);
        System.out.println(season.capacity());
        System.out.println(season.contains("Monday"));
        System.out.println(season.containsAll(days));


/*        String[] str = {};
        season.copyInto(str);

        for(String s : str) {
            System.out.println(s);
        }*/


    }
}
