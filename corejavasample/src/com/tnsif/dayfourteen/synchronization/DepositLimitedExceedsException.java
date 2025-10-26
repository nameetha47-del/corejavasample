package com.tnsif.dayfourteen.synchronization;

public class DepositLimitedExceedsException extends Exception {

	public DepositLimitedExceedsException()
	{
		super("Daily limit of Deposit is exceeded..");
	}
	public DepositLimitedExceedsException(String message)
	{
		super(message);
	}
}
