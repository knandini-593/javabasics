class Account{
    int accountNumber;
    void showAccount(){
        System.out.println("Account Number:" +accountNumber);
    }
}
class SavingAccount extends Account{
    double interestRate;
    void showSavingDetails(){
        System.out.println("Interest Rate:" +interestRate);
    }
}
class FixedDepositAccount extends SavingAccount{
    int lockInYears;
    void showFDDetails()
    {
        System.out.println("Lock-in Years:" +lockInYears);
    }
}
public class hw2 {
    public static void main(String[] args){
    FixedDepositAccount fd=new FixedDepositAccount();
    fd.accountNumber=12345;
    fd.interestRate=6.5;
    fd.lockInYears=3;
    fd.showAccount();
    fd.showSavingDetails();
    fd.showFDDetails();
}
}
