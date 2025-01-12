package javaBasics;

public class Constructor {

	int person_Id;
	String name;
	double salary;

	public Constructor() {
		System.out.println("non-parameterized constructor.");
	}
	
	private Constructor(String name,int person_Id) {
		this();
		this.name =name;
		this.person_Id = person_Id;
	}
	
	public Constructor(String name,int person_Id,double salary) {
		System.out.println("constructor class");
		this.person_Id = person_Id;
		this.salary = salary;
		this.name =name;
	}

	public static void main(String[] args) {
		Constructor c = new Constructor("krish",21);
		Constructor c1 = new Constructor("ram",18);
		Constructor c2 = new Constructor("java",52);
		
		Constructor c3 = new Constructor("Advanced java",52,25000.0);
		
		System.out.println(c.name+" "+c.person_Id);
		System.out.println(c1.name+" "+c1.person_Id);
		System.out.println(c2.name+" "+c2.person_Id);
		System.out.println(c3.name+" "+c3.person_Id+" "+c3.salary);
	}
}
