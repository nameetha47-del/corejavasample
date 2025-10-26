package com.tnsif.dayfourteen.synchronization;

public interface Bank {
    int MINBAL = 5000;           // constants are public static final by default
    int DAILY_LIMIT = 25000;

    void deposit(int amt) throws DepositLimitedExceedsException;
    void withdraw(int amt) throws InsufficientBalanceException;
}
