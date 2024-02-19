package Developer;

public class TestBankAccount1 {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Paris Hilton", "127-983-3847", 1000000.00);
        System.out.println("The balance of account1 is $" + account1.getBalance());
        account1.deposit(300);
        System.out.println("The balance of account1 is $" + account1.getBalance());
    }
}
