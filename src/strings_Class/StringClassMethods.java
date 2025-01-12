package strings_Class;

public class StringClassMethods {
	
	public static void main(String[] args) {
		
		StringClassMethods sm=new StringClassMethods();
		sm.stringMethods();
		
		//  new StringClassMethods().stringMethods();
		
		//StringBuffer is mutable.
		StringBuffer sb = new StringBuffer("ramu");
		System.out.println("String buffer: "+sb);
		sb.append("lu");
		System.out.println("String buffer: "+sb);
	}
	
	public void stringMethods() {
		
		char surNameFirstLetter ='k';
		System.out.println(surNameFirstLetter);
		
		// String is a class in java, it represents sequence of character. 
		String name ="ramulu";
		System.out.println(name);
		
		// String is immutable in java.
		String fullName = name.concat("lu");
		
		System.out.println(name);
		System.out.println(fullName);
		
		//"length method" id used to get the characters number in String.
		System.out.println("lenght of the String: "+name.length());
		System.out.println("lenght of the String: "+fullName.length());
		
		// "trim method" is used to remove the space before and after the String.
		System.out.println("Trim method: "+name.trim());
		
		// "equals method" is used to compare the two Strings, if both are same then it return true otherwise it returns false.
		// It is a case sensitive.
		String  names= "Ramul";
		System.out.println("equals methos: "+name.equals(names));
		
		// "equalsIgnoreCase method" is used to compare the two Strings, if both are same then it return true otherwise it returns false.
		// It does not case sensitive.
		String  n= "RamulU";
		System.out.println("equalsIgnoreCase method: "+name.equalsIgnoreCase(n));
		
		// check whether the String is empty. isEmpty() method returns if String is empty.
		System.out.println("check whether the String is empty: "+name.isEmpty());
		
		// return character at specified index.
		System.out.println("Get the character at specified character: "+name.charAt(1));
		
		// check whether the String contains specific characters. it returns boolean value. if the String matches sequence of characters then it return true.
		System.out.println("contains method: "+name.contains("ramu"));
		
		// indexOf method return starting index of specified character.
		String word ="hello world";
		System.out.println("indexOf method: "+word.indexOf("ld"));
		
		// endsWith method return true if the String ends with specified String. 
		System.out.println("endsWith: "+word.endsWith("ld"));
		
		System.out.println("startsWith method: "+word.startsWith("hello"));
		
	}
}
