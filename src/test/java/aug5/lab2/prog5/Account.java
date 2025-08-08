package aug5.lab2.prog5;

import aug5.lab2.Person;

public abstract class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	public abstract void withdraw();


	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public String toString() {
		return ("Name            : " + accHolder.getName() + "\nAge             : " + accHolder.getAge()+"\nAccount number  : " + 
				accNum + "\nAccount balance : " + balance + "\n");
	

}
	}
