package aug2.pack1;

public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Rony", "Dominic", 'M');
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(p.getGender());
		
		System.out.println("After using setter \n");
		
		p.setFirstName("Arun");
		p.setLasttName("ABC");
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
