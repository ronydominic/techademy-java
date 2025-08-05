package aug4;

import java.time.LocalDate;
import java.time.Period;

public class prog15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dob = LocalDate.of(2005, 05, 06);
		Person p = new Person("Rony", "Dominic", 'M',dob);
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(p.getGender());
		System.out.println("Age : " + p.getAge(p.getDob()));
		
		System.out.println("\n After using setter \n");
		
		p.setFirstName("Arun");
		p.setLasttName("ABC");
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(p.getGender());
		System.out.println("Age : " + p.getAge(p.getDob()));


	}

}

class Person {
	private String firstName;
	private String lastName;
	private char gender;
	private LocalDate dob;
	
	public Person(String firstName, String lastName, char gender, LocalDate dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		
	}
	
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public LocalDate getDob() {
		return this.dob;
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
	
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	
	public int getAge(LocalDate dob) {
		Period age = Period.between(dob, LocalDate.now());
		return age.getYears();
	}
}
