public class Student {
	private String firstName;
	private String lastName;
	private int id;
	private int age;
	
	public Student (String firstName, String lastName, int id, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
	}
	
	/**
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param firstName (method takes firstName string)
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * @param lastName (method takes lastName string)
	 */
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	/**
	 * @param id (method takes id int)
	 */
	public void setId(int id){
		this.id = id;
	}
	
	/**
	 * @param age (method takes age int)
	 */
	public void setAge(int age){
		this.age = age;
	}

	public static void main(String[] args) {
		

	}

}
