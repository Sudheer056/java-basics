package javaBasics;

public class Constructor_Call extends Constructor {
	
	public Constructor_Call(String name,int person_Id, double salary){
		super(name,person_Id,salary);
		System.out.println("Constructor_Call class");
	}
	
	public static void main(String[] args) {
	//	Constructor c = new Constructor("krish",21);
	//	Constructor c3 = new Constructor("Advanced java",52,25000.0);
		
		Constructor_Call cc = new Constructor_Call("python",131,25000.0);
		System.out.println(cc.name+" "+cc.person_Id+" "+cc.salary+" ");
	}

}
