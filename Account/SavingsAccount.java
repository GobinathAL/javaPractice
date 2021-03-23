class SavingsAccount extends Account implements Calculate {
    int noofTransactions;
    public SavingsAccount(int accno, String accname, double balance) {
        super(accno, accname, balance);
        noofTransactions = 0;
    }  
    @Override
    public String toString() {
        return "Account Type: Savings Account, " + super.toString() + ", noofTransactions: " + noofTransactions;
    }
    @Override
    void deposit(double amt) {
        if(noofTransactions >= totalTrans) {
            System.out.println("Deposit Failed! noofTransaction exceeded totalTrans");
            return;
        }
        balance += amt;
        noofTransactions++;
    }
    @Override
    double withdraw(double amt) {
        if(noofTransactions >= totalTrans) {
            System.out.println("Withdraw Failed! noofTransaction exceeded totalTrans");
            return balance;
        }
        balance -= amt;
        noofTransactions++;
        return balance;
    }
    @Override
    public double cal_interest() {
        return balance * 1 * interest_rate;
    }
}
