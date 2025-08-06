package aug5.lab2;

public class SavingsAccount extends Account{
	private final long minimumBalance = 1000;
	private static long accSeq = 2000000L;
	private long accNum;
	private double balance;
	private Person accHolder;
	
	public SavingsAccount(Person accHolder) {
		super(accHolder);
		
	}
	
	@Override
	public boolean withdraw(double amount){
		balance = getBalance();
		if((balance - amount) > minimumBalance) {
			balance -= amount;
			setBalance(amount);
			return true;
		} else {
			System.out.println("Insufficient balance");
			return false;
		}
		
	}
	

}
