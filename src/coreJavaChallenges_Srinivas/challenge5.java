package coreJavaChallenges_Srinivas;

public class challenge5 {
	
	static int i = m1();
	static float f = m2();
	static char c = m3();
	static boolean b = m4();

	public static void main(String[] args) {
	}
	
	static int m1()
	{
		System.out.println("Int Default Value: " + i);
		return 111;
	}
	static float m2()
	{
		System.out.println("Float Default Value: " + f);
		return 20;
	}
	static char m3()
	{
		System.out.println("Char Default Value: " + c);
		return 'a';
	}
	static boolean m4()
	{
		System.out.println("Boolean Default Value: " + b);
		return true;
	}
	
}
