class CheckingAccount extends Account implements Calculate{
    public CheckingAccount(int accno, String accname, double balance) {
        super(accno, accname, balance);
    }
    @Override
    public String toString() {
        return "Account Type: Checking Account, " + super.toString();
    }
    @Override
    void deposit(double amt) {
        balance += amt;
    }
    @Override
    double withdraw(double amt) {
        if(balance - amt > 1000) {
            balance -= amt;
        }
        else {
            System.out.println("Cant be withdrawn");
        }
        return balance;
    }
    @Override
    public double cal_interest() {
        return balance * 1 * interest_rate;
    }
}