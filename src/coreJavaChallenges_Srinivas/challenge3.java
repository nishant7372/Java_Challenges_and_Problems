package coreJavaChallenges_Srinivas;
import java.util.Scanner;

public class challenge3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the integer n:");
		int n = scan.nextInt();
		scan.close();
		
		if(n%2!=0)
		{
			System.out.println("Hello");
		}
		else
		{
			if(n>=0 && n<=10)
			{
				System.out.println("Hi");
			}
		    if(n>=11 && n<=20)
		    {
				System.out.println("Hello");
			}
		    if(n>20)
		    {
		    	System.out.println("Bye");
		    }
		    	
		}
	}
}
