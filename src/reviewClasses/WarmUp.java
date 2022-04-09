package reviewClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUp {
    public static void main(String[] args) {

        int number = 35;
        if(number%2==0){
            System.out.println("it is an even number");
        } else {
            System.out.println("it is an odd number");
        }

        int [] intArray = {23, 223, 34, 123,34, 435, 345, 2, 34, 3456, 234, 2352, 23454, 23, 45};
        int max = 0;
        for(int i=0; i<intArray.length; i++){
            if (intArray[i] > max){
                max = intArray[i];
            }
        }
        System.out.println(max);

/*        Arrays.sort(intArray);
        int secondMax = intArray.length-2;
        System.out.println(intArray[secondMax])*/;

        ArrayList <Integer> intArrayList = new ArrayList<Integer>();
        for(int i : intArray){
            intArrayList.add(i);
        }
        Collections.sort(intArrayList);
        System.out.println(intArrayList.get(intArrayList.size()-2));



    }
}
