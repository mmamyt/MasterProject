package encapsulation;

public class TestLoginClass {
    public static void main(String[] args) {
        String UserNameInputBox = "id = username";
        String PasswordInputBox = "id = password";

        DataTransferClass data = new DataTransferClass();
        System.out.println(UserNameInputBox + ": " + data.getUser());
        System.out.println(PasswordInputBox + ": " + data.getPwd());

    }
}
