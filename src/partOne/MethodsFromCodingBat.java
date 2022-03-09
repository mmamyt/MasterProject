package partOne;

public class MethodsFromCodingBat {

    public static void main(String[] args) {
        System.out.println(MethodsFromCodingBat.twoChar("coffee", 5));

        System.out.println(MethodsFromCodingBat.nTwice("Christmas", 3));

        int [] ddd = {12, 5, 4};
        MethodsA ob1 = new MethodsA();
        ob1.maximum(ddd);
    }

    //twoChar method
    public static String twoChar(String str, int index) {
        int ni = index + 2;
        if(index > 0 && (index + 1) < str.length()){
            return str.substring(index, ni);
        } else {
            return str.substring(0,2);
        }
    }

    /* Given a string and an int n, return a string made of the first and last n chars from the string.
    The string length will be at least n.
    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce"*/
    public static String nTwice(String str, int n) {
        String part1 = str.substring(0, n);
        String part2 = str.substring(str.length()-n, str.length());
        return part1+part2;
    }


}
