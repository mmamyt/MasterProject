package wrapperClass;

public class ExerciseOne {
    public static void main(String[] args) {

        short s = 20;
        //System.out.println(s);

        Short objShort = s;
        //System.out.println(objShort);

        byte b = 50;
        Byte objByte = 30;
        System.out.println(b + " " + objByte.compareTo(b));

        int i = 40;
        Integer objInt = 40;
        System.out.println(i + " " + objInt.toString());

        String year = "2022";
        System.out.println(year);
        Integer yearInt = Integer.parseInt(year);
        System.out.println(yearInt.compareTo(2022));

        //autoboxing
        int n1 = 40;
        Integer n1Obj = 40;

        //unboxing
        Integer n2Obj = 30;
        int n2 = n2Obj;

    }
}
