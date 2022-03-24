package encapsulation;

public class AccountInfo {

    private String accountNumber;
    private long routingNumber;
    private double balance;
    private String customerName;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18){
            this.age = age;
        } else {
            System.out.println("Not eligible age to open an account");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(long routingNumber) {
        this.routingNumber = routingNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        for(int i = 0; i < customerName.length(); i++) {
            String str = customerName.toLowerCase();
            if (!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') && str.charAt(i) != 32){
                return "Enter valid name";
            }
        }
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;

    }


}
