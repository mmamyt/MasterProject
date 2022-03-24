package encapsulation;

public class BobAccount {

    public static void setAccount(){
        AccountInfo bobAccount = new AccountInfo();
        bobAccount.setCustomerName("Bob Marley");
        bobAccount.setAccountNumber("9493929");
        bobAccount.setRoutingNumber(19192929);
        bobAccount.setBalance(2000.00);
        bobAccount.setAge(33);

        System.out.println(bobAccount.getAccountNumber());
        System.out.println(bobAccount.getCustomerName());
        System.out.println(bobAccount.getRoutingNumber());
        System.out.println(bobAccount.getBalance());
        System.out.println(bobAccount.getAge());
    }

    public static void main(String[] args) {
        setAccount();

    }
}
