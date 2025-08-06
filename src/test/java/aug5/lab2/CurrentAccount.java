package aug5.lab2;

public class CurrentAccount extends Account {
	private static long accSeq = 3000000L;
	private long accNum;
	private double balance;
	private Person accHolder;
	private long overdraftLimit = -5000l;
	
	
	public CurrentAccount(Person accHolder) {
		super(accHolder);
		
		
		
	}


	@Override
	public boolean withdraw(double amount){
		balance = getBalance();
		if((balance-amount) > overdraftLimit) {
			balance -= amount;
			setBalance(balance);
			return true;
		} else {
			System.out.println("amount more than  overdraft limit\n");
			return false;
		}
	}

}
