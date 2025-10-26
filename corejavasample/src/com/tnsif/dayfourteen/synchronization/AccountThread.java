package com.tnsif.dayfourteen.synchronization;

public class AccountThread extends Thread {
    private Account acc;
    private int amt;

    public AccountThread(Account acc, int amt) {
        this.acc = acc;
        this.amt = amt;
        start(); // starting the thread automatically
    }

    @Override
    public void run() {
        try {
            synchronized (acc) {  // ensure thread safety
                acc.withdraw(amt);
            }
        } catch (InsufficientBalanceException e) {  // ✅ exact class name
            System.err.println(e.getMessage());
        }
    }
}
