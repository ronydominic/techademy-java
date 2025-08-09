package aug6;


public class Prog1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("","", 'M');
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(p.getGender());
		

		

	}

}

class Person {
	private String firstName;
	private String lastName;
	private char gender;
	
	public Person(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		try {
			if(firstName.equals("") && lastName.equals("")) {
				throw new BlankNameException("empty first name and last name");
			} 
		}
			catch(BlankNameException e) {
				e.printStackTrace();
			}
		
		
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setLasttName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return this.lastName;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return this.gender;
	}
}

class BlankNameException extends Exception {
	public BlankNameException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}
