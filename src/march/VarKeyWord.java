package march;

public class VarKeyWord {
    public static void main(String[] args) {

        byte b = 2;
        short s = 20;
        int x = 10;
        long l = 1200000;
        char c = 'C';
        boolean bb = true;
        String str = "Hello";

        //var keyword can be used without mentioning data type, auto-detecting data type of the variable
        var name = "Vale";
        var num = 20;
        var byteNumber = 12;
        var shortNumber = 3;
        var floatNumber = 12.50;
        var booleanValue = true;

        //restrictions: var can be used for local variables in the method, but not on the class level (data member)
        //cannot declare without initializing
        //cannot be passed as a parameter of the method

    }


}
