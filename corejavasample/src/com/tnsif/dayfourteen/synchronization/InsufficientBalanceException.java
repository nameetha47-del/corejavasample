package com.tnsif.dayfourteen.synchronization;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {
		super("InSufficient Balance in your account");
	}

	public InsufficientBalanceException(String message) {
		super(message);
	}
}