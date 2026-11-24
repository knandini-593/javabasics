class BankAccount {
    private String accountHolder;
    private double balance = 0;

    public void getter() {
        System.out.println(accountHolder);
        System.out.println(balance);
    }

    public void setter(String name) {
        accountHolder = name;
    }

    public void setter(double b) {
        balance = b;
    }
}

public class datavalid{
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.getter();
        b.setter("Nandu");
        b.setter(5000);
        b.getter();
    }
}