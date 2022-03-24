package abstraction;

public abstract class PageTitleValidation {

    public String name;
    public abstract boolean verifyTitle(String title);

    public PageTitleValidation(String name){
        this.name = name;
    }


}
