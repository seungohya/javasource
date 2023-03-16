package ch7;

import javax.management.RuntimeErrorException;

public class BalanceInsufficientException extends RuntimeErrorException {

	public BalanceInsufficientException() {
		super();
	
	}
	public BalanceInsufficientException(Error message) {
		super(message);
		
	}




}
