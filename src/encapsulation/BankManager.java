package encapsulation;

public class BankManager extends BankOfAmerica {

    public static void main(String[] args) {
        BankOfAmerica ba = new BankOfAmerica();
        System.out.println("Customer: "+ba.fullName);
        System.out.println("The routing No " + ba.routingNumber);
        System.out.println("Debit Card Number: " + ba.getDebitCardNumber());
        System.out.println("this is AccNum: " + ba.getAccountNumber());

        ba.setSsn(234999238);
        System.out.println("this is SSN: " + ba.getSsn());

    }
}
