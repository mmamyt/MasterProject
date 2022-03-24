package abstraction;

public class HomePageTestCase01 {


    public static void main(String[] args) {
        HomePage page = new HomePage("TC01");
        page.verifyTitle("Home Page");

        HomePage ctPage = new HomePage("TCO1");
        ctPage.verifyTitle("Customer Page");
    }

}
