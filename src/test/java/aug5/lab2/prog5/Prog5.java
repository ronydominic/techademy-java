package aug5.lab2.prog5;

import aug5.lab2.Account;
import aug5.lab2.CurrentAccount;
import aug5.lab2.Person;
import aug5.lab2.SavingsAccount;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Smith", 22);
		Account a1 = new SavingsAccount(p1);
		a1.deposit(2000);
		
		Person p2 = new Person("Kathy", 32);
		Account a2 = new CurrentAccount(p2);
		a2.deposit(3000);
		System.out.println("Initital balance of "+a1.getAccHolder().getName() +" is : " + a1.getBalance());
		System.out.println("Initial balance of "+a2.getAccHolder().getName() +" is : " + a2.getBalance());
		System.out.println();

	

		
		a1.deposit(2000);
		System.out.println("Updated balance of "+a1.getAccHolder().getName() +" is : " + a1.getBalance());
		a2.withdraw(9000); 
		System.out.println("Updated balance of "+a2.getAccHolder().getName() +" is : " + a2.getBalance());
		System.out.println();
		
		a2.withdraw(6000); 
		System.out.println("Updated balance of "+a2.getAccHolder().getName() +" is : " + a2.getBalance());
		System.out.println();
		
		System.out.println(a1);
		System.out.println(a2);


	}
}
