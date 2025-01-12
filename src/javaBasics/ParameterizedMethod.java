package javaBasics;

// create methods with the parameters.
public class ParameterizedMethod {

	public static void main(String[] args) {
		int additionValue = math(5, 10);
		System.out.println(additionValue);
		math(5, 10, 10,"Add");
	}

	public static int math(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public static void math(int num1, int num2, int num3, String kindOfOperation) {
		if (kindOfOperation.equals("Add")) {
			int sum = num1 + num2 + num3;
			System.out.println(sum);
		} else if (kindOfOperation.equals("sub")) {
			int sum = num1 - num2 - num3;
			System.out.println(sum);
		}

	}

}
