package aug2.pack1;

public class Lab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3 p = new Person3("Rony", "Dominic", Gender.M, 8967452312l);
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(p.getGender());
		
		System.out.println("After using setter \n");
		
		p.setFirstName("Arun");
		p.setLasttName("ABC");
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(p.getGender());
		
		p.displayDetails();

	}

}

class Person3{
	
	private String firstName;
	private String lastName;
	private Gender gender;
	private long phone;
	
	public Person3(String firstName, String lastName, Gender gender, long phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phone = phone;
		
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
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Gender getGender() {
		return this.gender;
	}
	
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public long getPhone() {
		return this.phone;
	}
	
	public void displayDetails() {
		System.out.println("Person Details: ");
		System.out.println("First Name :" + this.firstName);
		System.out.println("Last  name : " + this.lastName );
		System.out.println("Gender: " + this.gender);
		System.out.println("Phone: " + this.phone);
	}
}
enum Gender {
	M, F
}

