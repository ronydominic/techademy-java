package aug6;

public class Account {
	protected static long accSeq = 1000000L;
	private long accNum;
	private double balance;
	private Person1 accHolder;
	
	
	
	public long getAccNum() {
		return accNum;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person1 getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person1 accHolder) {
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

	public Account(Person1 accHolder) {
		this.accHolder = accHolder;
		this.accNum = accSeq;
		accSeq +=1;
	}
	
	public String toString() {
		return ("Name            : " + accHolder.getName() + "\nAge             : " + accHolder.getAge()+"\nAccount number  : " + 
				accNum + "\nAccount balance : " + balance + "\n");
	}
	
	}


