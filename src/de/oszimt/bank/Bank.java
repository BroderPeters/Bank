package de.oszimt.bank;

public class Bank {
	private static Bank INSTANCE;
	private Bank() {
		
	}
	
	public static Bank getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Bank();
		}
		return INSTANCE;
	}
}
