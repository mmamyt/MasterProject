package abstraction;

public class CustomerPage extends PageTitleValidation{

    public CustomerPage(String name) {
        super(name);
    }

    @Override
    public boolean verifyTitle(String title) {
        return title.equals("Customer Page");
    }
}
