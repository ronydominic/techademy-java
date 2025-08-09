package aug6;

public class Person1 {
	private String name;
	private float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public Person1(String name, float age) {
		this.name = name;
		if(age < 15) {
			try {
				throw new UnderAgeException("set Age above 15");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
		this.age = age;
		}
		
	}
	
	

}
class UnderAgeException extends Exception {
	public UnderAgeException(String msg) {
		super(msg);

	}
}
