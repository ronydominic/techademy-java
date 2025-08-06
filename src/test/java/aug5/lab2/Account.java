package aug5.lab2;

public class Account {
	protected static long accSeq = 1000000L;
	private long accNum;
	private double balance;
	private Person accHolder;
	
	
	
	public long getAccNum() {
		return accNum;
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
	
	public boolean withdraw(double amount){
		if(amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance");
			return false;
		}
		return true;
		
	}

	public Account(Person accHolder) {
		this.accHolder = accHolder;
		this.accNum = accSeq;
		accSeq +=1;
	}
	
	public String toString() {
		return ("Name            : " + accHolder.getName() + "\nAge             : " + accHolder.getAge()+"\nAccount number  : " + 
				accNum + "\nAccount balance : " + balance + "\n");
	}
	
	}
