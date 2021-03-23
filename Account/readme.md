# Inheritance and Interface

1. Create an abstract class called **Account** that has datamembers: **accno**(int), **accname**(String) and **balance**(double). The member methods are: parameterized constructor and toString method. Abstract methods : **void deposit(double amt)** and **double withdraw(double amt)**
2. Derive two classes from class **Account: SavingsAccout** and **CheckingAccount**. The members of **SavingsAccount** are **noofTransactions**(int), parameterized constructor, overridden methods **toString(), deposit(double amt)** that increments balance with amt, **withdraw(double amt)** that decrements balance by amt and **noofTransactions** is incremented by 1 inside **deposit()** and **withdraw**. The members of **CheckingAccount** are parameterized constructor, overrideen methods **deposit(double amt)** that increments balance with amt, **withdraw(double amt)** that decrements the balance by amt only if the balance is above 1000 after decrementation and **toString()**.
3. Define **TestAccount** that initiates objects of **SavingsAccount** and **CheckingAccount**. The methods of the derived class are tested. Check if the **SavingsAccount** object is an instance of class **Account.**

```java
public interface Calculate {
  public static final int totalTrans = 3;
  double interest_rate = 0.15;
  public double cal_interest();
}
```
4. Implement the above interface in SavingsAccount and CheckingAccount. The totalTrans gives the total number of transations the SavingsAccount object can perform while the cal_interest is overrideen in SavingsAccount and CheckingAccount to calculate the interest for the balance(using the formula PNR/100).
5. Validate the above in TestAccount class.
