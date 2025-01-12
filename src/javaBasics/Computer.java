package javaBasics;

class Computer {
	public void PlayMusic()
	{
		System.out.println("PlayMusic");
	}
	public String getMePen(int Cost)
	{
		if (Cost >=10)
		return "Pen";
		
		return "Nothing";
	}
	public static void main(String a[])
	{
		Computer obj = new Computer();
		obj.PlayMusic();
		String str = obj.getMePen(1);
		System.out.println(str);
	}
	
	
}
