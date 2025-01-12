package javaBasics;

class Adding {
int a;
int add(int n1, int n2)
{
	int r = n1 + n2;
		return r;
}

	public static void main(String a[]) {
		
		int Num1 = 5;
		int Num3 = 6;
		Adding Clone = new Adding();
		int result = Clone.add(Num1, Num3);
		System.out.println(result);
	
		
	}
}

