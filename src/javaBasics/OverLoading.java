package javaBasics;

class OverLoading {
public int add(int n1, int n2, int n3)
{
	return n1 + n2 + n3;
}
public int add(int n1, int n2)
{
	return n1 + n2;
}
public static void main(String a[])
{
	OverLoading obj = new OverLoading();
	int r = obj.add(3, 5);
	System.out.println(r);
}
}
