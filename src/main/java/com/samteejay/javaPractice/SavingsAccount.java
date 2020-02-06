package main.java.com.samteejay.javaPractice;


public class SavingsAccount {
	/* This class represents a Savings account
	with the owner's name, PIN, and balance. */

	private static final double RATE = 0.02;
	private String name;
	private String pin;
	private double balance = 0.0;

	public SavingsAccount() {}

	public SavingsAccount(String name, String pin, double balance) {
		this.name = name;
		this.pin = pin;
		this.balance = balance;
	}

	/* public str() {
		result =  'Name:    ' + this.name + '\n'
		result += 'PIN:     ' + this.pin + '\n'
		result += 'Balance: ' + str(this.balance)
		return result */

	public double getBalance() {
		return this.balance;
	}

	public String getName() {
		return this.name;
	}

	public String getPin() {
		return this.pin;
	}

	public double deposit(double amount) {
		/* Deposits the given amount and returns the
		new balance */
		this.balance += amount;
		return this.balance;
	}

	public String withdraw(double amount) {
		/*Withdraws the given amount.
		Returns None if successful, or an
		error message if unsuccessful*/

		if (amount < 0) {
			return "Amount must be >= 0";
		}
		else if (this.balance < amount) {
			return "Insufficient funds";
		}
		else {
			this.balance -= amount;
			return null;
		}
	}

	public double computeInterest() {
		/*Computes, deposits, and returns the interest*/
		double interest = this.balance * SavingsAccount.RATE;
		this.deposit(interest);
		return interest;
	}
}

