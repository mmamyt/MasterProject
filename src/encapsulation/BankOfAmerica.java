package encapsulation;

public class BankOfAmerica {
    //data members with diff access modifiers
    public String fullName = "John Smith";
    private long ssn;
    private int age = 32;
    private long accountNumber = 4332224;
    public long routingNumber = 34534666;
    private long debitCardNumber = 2346678;

    //to private data callable from diff class get
    public long getDebitCardNumber(){
        return debitCardNumber;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    //right click > generate > setter and getter
    public long getSsn() {
        return ssn;
    }
    public void setSsn(long ssn) {
        String ssnStr = Long.toString(ssn);
        if(ssnStr.length() == 9) {
            this.ssn = ssn;
        } else {
            System.out.println("Invalid SSN");
        }
    }




}
