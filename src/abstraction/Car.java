package abstraction;

public abstract class Car {

    final String brand = "Toyota";
    public String model = "Corolla";
    public int year = 2022;
    public String VIN = "ABC1231223";

    public abstract void starting();
    public abstract void driving();
    public abstract void stopping();
    public abstract void parking();


}
