package oops;

// Inheritance
// InheritanceEx is the child class, because it get the properties from the ParentClass through inheritance.
// A class can get all the properties of another class using inheritance with the 'extends' keyword.
// private members of parent class we can't access in child class.
public class InheritanceEx extends ChildClass1{

	public static void main(String[] args) {
	//	System.out.println(carKey); private parent class member can't access in child class.
		vehicle();
		System.out.println("--------------------------");
		fourWheelervehicle();
	}
}

class ParentClass1 { // parent class
	static String bike= "platina";
	static String bikeColoue ="Red";
	static String bikeCapacity = "125cc";
	
	public static void vehicle() {
		System.out.println("Bike company: "+bike);
		System.out.println("Bike colour: "+bikeColoue);
		System.out.println("Bike capacity: "+bikeCapacity);
	}
}

class ChildClass1 extends ParentClass1{ // parent class
	static String car= "TATA Tiago";
	static String carColoue ="Red";
	static String carCapacity = "1000 cc";
	private static int carKey =123;
	
	public static void fourWheelervehicle() {
		System.out.println("Car company: "+car);
		System.out.println("Car colour: "+carColoue);
		System.out.println("Car capacity: "+carCapacity);
		System.out.println("Car key: "+carKey);
	}
}