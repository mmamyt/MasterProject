package abstraction;

public class HomePage extends PageTitleValidation{

    public HomePage(String name) {
        super(name);
    }

    @Override
    public boolean verifyTitle(String title) {
        if(title.equals("Home Page")){
            return true;
        } else {
            return false;
        }



    }
}
