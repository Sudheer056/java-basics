package javaBasics;

public class Variables {

	// syntax: data_type Identifier( variable name ) = value;
	
	/*
	 *  It must be starts with letters.
	 *  variable name does not start with numeric value, but it contain numeric value in middle of the variable or end of the variable. 
	 *  It does not contain space.
	 *  It does not declare with special characters except underscore.
	 */

	/*
	 * Three types of variables.
	 * 
	 * 1. Instance variable: It is related to the class object.
	 * 		1.1. Instance variable can access in Static context with the class Object. 
	 * 		1.2. Instance variable can access directly in Non-static(Instance) method. 
	 * 
	 * 
	 * 2. static variable:
	 * 		2.1. static method can access directly by using Identifier in Static and Non-static method. 
	 * 
	 * 
	 * 3. local variable 
	 * 		3.1. Local variables access only within the declared block.
	 */
	
	
	int inst_var = 100; //0
	
	// static data_type Identifier = value;
	static float  stat_var = 10.21f;
	
	
	public static void main(String[] args) { // static method
		
		Variables v = new Variables();
		
		// local variable. local variable must be initialized and it must be use in the method.
			int local_var = 110;
			
			System.out.println("Accessing local variable in the declared main method by using identifier: "+local_var);
			
		  // Accessing instance variable in the static method.
			System.out.println("Accessing instance variable in the static method using object: "+v.inst_var);
			//System.out.println("Accessing instance variable in the static method using class name: "+ Variables.inst_var);
			//System.out.println("Accessing instance variable in the static method using Identifier: "+inst_var);
			
		  // Accessing static variable in the static method.
			System.out.println("Accessing static variable in the static method using Identifier: "+stat_var);
			System.out.println("Accessing static variable in the static method using class name: "+ Variables.stat_var);
			
			System.out.println();
		  // Accessing instance method in static context(static method) by using class object
			v.Instance();
			
			
	}
	
	 public void Instance() {	// Non-static method
		 
		 // Accessing local variable in outside method, variable declared in the main method, 
		 //but we can trying to access in the instance method
		// System.out.println("Accessing local variable in the declared main method by using identifier: "+local_var); error
		 
	// Accessing instance variable in the instance method.	 
		 System.out.println("Accessing instance variable in the instance method using Identifier: "+inst_var);
	
	 // Accessing static variable in the instance method
		 System.out.println("Accessing static variable in the instance method using identifier: "+ stat_var);
		 System.out.println("***************");
		 
	 }

}
