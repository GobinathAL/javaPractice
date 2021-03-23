abstract class Account {
    int accno;
    String accname;
    double balance;
    public Account(int accno, String accname, double balance) {
        this.accno = accno;
        this.accname = accname;
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "accno: " + accno + ", accname: " + accname;
    }
    abstract void deposit(double amt);
    abstract double withdraw(double amt);
}
