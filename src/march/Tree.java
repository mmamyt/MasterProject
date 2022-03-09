package march;

public class Tree {
    //instance variables, in order to access instance of a class need to be created
    int age = 10;
    String type = "Fruit Tree";

    //static variables
    static double price = 70.00;
    static String name = "Apple tree";

    public static void main(String[] args) {
        //local variable
        String delivery = "04/20/2020";

        //calling instance variables
        Tree tree = new Tree();
        System.out.println(tree.age);
        System.out.println(tree.type);

        //calling static variables
        System.out.println(price);
        System.out.println(name);

        //calling local variable
        System.out.println(delivery);

        //if the method non-static then create an object
        System.out.println(getTreePrice());
    }

    public static double getTreePrice(){
        //static variable can be called easily without
        return price;
    }
}
