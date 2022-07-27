package leetcode_problems;

import java.util.Scanner;
//Prob. - No. of steps to reduce a no. to zero
public class Leetcode_Prob_1 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		int ans = steps(n,0);
		System.out.println("No. of Steps: " + ans);
		scan.close();
	}

	static int steps(int n, int c)
	{
		if(n==0)
		return c;
		if(n%2==0)
	    return steps(n/2, c+1);
		else
		return steps(n-1, c+1);
		
	}
}
