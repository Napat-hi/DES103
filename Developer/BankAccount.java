package Developer;

    public class BankAccount {
        public static int numAccount = 0;
        private String ownerName;
        private String accountNumber;
        private double balance;
        
        public BankAccount(String ownerName, String accountNumber, double balance) {
            this.ownerName = ownerName;
            this.accountNumber = accountNumber;
            this.balance = balance;
            numAccount++;
        }
        public void deposit(double amount) {
            balance = balance + amount;
            System.out.println("Deposit: $" + amount);
        }
        protected void withdraw(double amount) {
            if (balance > amount) {
                balance = balance - amount;
                System.out.println("Withdraw: $" + amount);
            } else {
                System.out.println("Not enough balance!");
            }
        }
        void printInfo() {
            System.out.println(ownerName + "\t" + accountNumber + "\t" + balance);
        }
    
        
        public double getBalance() {
            return balance;
        }
    
    }

