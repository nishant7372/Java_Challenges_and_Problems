package leetcode_problems;

import java.util.Scanner;
//Problem - A Number after a double reversal
public class Leetcode_Prob_6 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int x = scan.nextInt();
		int ans = rev(x,0);
		int ans1 = rev(ans,0);
		if(x==ans1) //if input == output
			System.out.println(true);
		else
			System.out.println(false);
		scan.close();
	}

	static int rev(int n,int rev)
	{
		int r;
		if(n==0)
		return rev;
		r=n%10;
		rev = rev *10 + r;
		return rev(n/10,rev);
	}
}
