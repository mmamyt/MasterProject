package encapsulation;

public class DataTransferClass extends TestDataClass {
    public static String getUser() {
        return user;
    }

    public static String setUser(String user) {
        return user;
    }

    public static String getPwd() {
        return pwd;
    }

    public static String setPwd(String pwd) {
        return pwd;
    }

    private static String user = username;
    private static String pwd = password;
}
