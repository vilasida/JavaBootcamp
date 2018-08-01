package sef.ATestTask.FirstActivity;


public class Person {
	private int age;
	private String secondName;
	private String firstName;

//TODO 1 Implement Person Attributes

	//Behavior - default constructor
	public Person(){
		this.firstName="Unknow";
		this.secondName = "Unknow";
		this.age = 0;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String announce (){
		return "My name is "+ getFirstName()+ " " + getSecondName()+" and I am "+ getAge()+ " years old";
	}
}

