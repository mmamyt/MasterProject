package abstraction;

public class CarToyota extends Car{

    public void starting(){
        System.out.println(super.brand + " is started moving");
    }
    public void driving(){
        System.out.println(super.brand + " is being driven");
    }
    public void stopping(){
        System.out.println(super.brand + " just stopped");
    }
    public void parking(){
        System.out.println(super.brand + " is parked");
    }
    public void getCarProperty(){
        System.out.println(super.model);
        System.out.println(super.year);
        System.out.println(super.VIN);
        starting();
        driving();
        stopping();
        parking();
    }

    public static void main(String[] args) {
        CarToyota tt = new CarToyota();
        tt.getCarProperty();

    }
}
