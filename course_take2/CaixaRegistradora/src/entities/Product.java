package entities;

public class Product {
	 private int account_number;
	 private String holder;
	 private double balance;
	 public Product() {
		 
	 }

	public Product(int number, String holder, double initial_deposit) {
			setNumber(number);
			this.holder = holder;
			deposit(initial_deposit);
		}
	
	public double getDeposit() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "+getNumber()
				+", Holder: "+getHolder()
				+", Balance: $ "+getDeposit();
	}

	public int getNumber() {
		return account_number;
	}
	public void setNumber(int number) {
		account_number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
}