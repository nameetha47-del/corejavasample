package com.tnsif.dayfourteen.synchronization;

public class Account implements Bank {
    private int accNo;
    private String name;
    private double Balance;

    // Getters and Setters
    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    // Constructors
    public Account() {
        super();
    }

    public Account(int accNo, String name, double Balance) {
        this.accNo = accNo;
        this.name = name;
        this.Balance = Balance;
    }

    // Deposit method
    @Override
    public synchronized void deposit(int amt) throws DepositLimitedExceedsException {
        if (amt > 25000)
            throw new DepositLimitedExceedsException("Daily deposited Limit Exceededs...");
        else {
            Balance += amt;
            System.out.println("Amount Deposited: Rs." + amt);
            System.out.println("Current Balance: Rs." + Balance);
        }
    }

    // Withdraw method
    @Override
    public synchronized void withdraw(int amt) throws InsufficientBalanceException {
        if (Balance - amt < MINBAL)
            throw new InsufficientBalanceException("InSufficient Balance!");
        else {
            Balance -= amt;
            System.out.println("After withdrawing Rs." + amt + ", Current Balance: Rs." + Balance);
        }
    }

    // ToString
    @Override
    public String toString() {
        return "Account [accNo=" + accNo + ", Name=" + name + ", Balance=" + Balance + "]";
    }
}
