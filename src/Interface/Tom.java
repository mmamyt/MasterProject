package Interface;

public class Tom extends Cat{
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name("Tom"));
        System.out.println(cat.domestic(false));
    }
}
