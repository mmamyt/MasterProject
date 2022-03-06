package march;

public class Test03 {

/*    protected static void printYear(){
        System.out.println(2022);
    }

    //private is accessible within the same class
    private static void printYear01(){
        System.out.println(2022);
    }*/
public static void main(String[] args) {

    outer:
    for(int i = 0; i < 3; i++){
        inner:
        for(int j = 0; j < 3; j++){
            if(i == j)
                continue outer;
            System.out.print(i + " " + j + ", ");
        }
    }

}

}
