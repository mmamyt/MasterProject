package login.com;

public class LoginTestCase {

    public static void main(String[] args) {
        TestData data = new TestData();
        LoginPageLocator page = new LoginPageLocator();

        System.out.println("Opened Orange HRM Login Page");
        boolean title = page.isTitleDisplayed(data.pageTitle);
        System.out.println(title);

        page.enterUserName(data.userName);
        page.enterPassword(data.password);


    }
}
