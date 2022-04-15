package polymorphism;

public class MainDriverClass {
    public static void main(String[] args) {
        DriverClass driver;
        driver = new DriverClass();
        driver.getDriver();
        driver = new ChromeDriverClass();
        driver.getDriver();
        driver = new SafariDriverClass();
        driver.getDriver();
        driver = new FirefoxDriverClass();
        driver.getDriver();
    }
}
