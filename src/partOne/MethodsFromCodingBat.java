package partOne;

public class MethodsFromCodingBat {

    public static void main(String[] args) {
        System.out.println(MethodsFromCodingBat.twoChar("coffee", 5));
    }

    public static String twoChar(String str, int index) {
        int ni = index + 2;
        if(index > 0 && (index + 1) < str.length()){
            return str.substring(index, ni);
        } else {
            return str.substring(0,2);
        }
    }
}
