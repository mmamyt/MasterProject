package encapsulation;

public class ChaseBank {
    public static void main(String[] args) {

        BankAccount JohnAccount = new BankAccount();
        JohnAccount.setAccountNumber("128435155");
        JohnAccount.setBalance(1000.00);
        JohnAccount.setCustomerName("John Smith");
        JohnAccount.setEmail("johnsmith@gmail.com");
        JohnAccount.setPhoneNumber("312 - 234 - 23432");

        JohnAccount.deposit(500);
        JohnAccount.withdraw(490);
        JohnAccount.withdraw(590);
        JohnAccount.withdraw(340);
        JohnAccount.deposit(650);
        JohnAccount.withdraw(800);
    }
}
