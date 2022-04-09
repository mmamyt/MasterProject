package collectionFrameworks;

import java.util.*;

public class QueueClass {
    public static void main(String[] args) {
        Queue<String> que = new PriorityQueue<String>();
        //adds in alphabetical order
        que.add("John");
        que.add("Bob");
        que.add("Lee");
        que.add("John Smith");
        //first element
        System.out.println(que.peek());

        PriorityQueue<Integer> numbers = new PriorityQueue<Integer>();
        numbers.add(2334);
        numbers.add(345);
        numbers.add(344);
        numbers.add(4644);
        System.out.println(numbers);
        System.out.println(numbers.poll());
        numbers.remove();
        System.out.println(numbers);
        numbers.add(34534);
        numbers.add(34534);
        String str = Arrays.toString(numbers.toArray());
        System.out.println(str);


        Queue <Integer> q = new ArrayDeque<Integer>();
        q.add(234);
        q.add(345);
        q.add(343);
        q.add(98);
        q.addAll(numbers);
        System.out.println(q);

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
