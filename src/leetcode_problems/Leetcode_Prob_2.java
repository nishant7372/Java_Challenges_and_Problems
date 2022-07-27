package leetcode_problems;

import java.util.Scanner;

public class Leetcode_Prob_2 {
//Prob. - Subtract the product and sum of digits of an integer
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int x = scan.nextInt();
		int sum = sumfun(x,0);
		int mul = mulfun(x,1);
		System.out.println(mul-sum);
		scan.close();
	}
	static int sumfun(int n,int sum)
	{
		if(n==0)
		return sum;
		return sumfun(n/10,sum +n%10);
	}
	
	static int mulfun(int n,int mul)
	{
		if(n==0)
		return mul;
		return mulfun(n/10, mul*(n%10));
	}
}
