package login.com;

public class LoginPageLocator {

    String pageTitle = "Orange HRM";
    String userName = "UserName input box";
    String password = "Password input box";
    String loginButton = "LOGIN";

    TestData data = new TestData();

    public boolean isTitleDisplayed(String title){
        return pageTitle.equals(title);
    }
    public void enterUserName(String userName){
        System.out.println("Entered "+ userName +" into "+ this.userName);
    }

    public void enterPassword(String password){
        System.out.println("Entered "+ password +" into "+ this.password);
    }

    public void clickButton(){
        System.out.println("Clicked"+this.loginButton);
    }



}
