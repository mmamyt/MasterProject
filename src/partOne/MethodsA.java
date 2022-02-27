package partOne;

public class MethodsA {

    public static void main(String[] args) {

        int [] xyz = {12,432, 45, 456, 345, 3};
        MethodsA.maximum(xyz);
        MethodsA.minimum(xyz);


    }

    public static void maximum(int [] x){
        int max = x[0];
        for(int i = 0; i < x.length; i++) {
            if (max < x[i]) {
                max = x[i];
            }
        }
        System.out.println(max);
    }

    public static void minimum(int [] x){
        int min = x[0];
        for(int i = 0; i < x.length; i++) {
            if (min > x[i]) {
                min = x[i];
            }
        }
        System.out.println(min);
    }


}
