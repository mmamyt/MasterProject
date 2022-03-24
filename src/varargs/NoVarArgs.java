package varargs;

public class NoVarArgs {

    public double addNumbers(double x, double y){
        return x + y;
    }
    //method Overloading
    public double addNumbers(double x, double y, double z){
        return x + y + z;
    }

    //using ...args to be able to add as many parameters to method as needed
    public double addNumbers(double ... args){
        double result = 0;
        for(int i = 0; i < args.length; i++){
            result += args[i];
        }
        return result;
    }

    //args with String
    public String subStr(String ... str){
        String result = "";
        for(String args : str){
            result += args.charAt(0);
        }
        return result;
    }

    public static void main(String[] args) {
        NoVarArgs nv = new NoVarArgs();
        double result = nv.addNumbers(20,20);
        result = nv.addNumbers(20, 30, 20);

        //args in use
        result = nv.addNumbers(20, 30, 20, 30, 40);
        System.out.println(result);

        String subSTR = nv.subStr("asv", "asdf", "erty","234","adf");
        System.out.println(subSTR);
    }
}
