package leetcode_problems;

import java.util.Scanner;
//Nth Tribonnaci number
public class Leetcode_Prob_5 {
	public static void main(String[] s)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the term:");
		int m = scan.nextInt();
		int ans = tribonacci(m);
		System.out.println(m + "th term is: " + ans);
		scan.close();
	}

	static int tribonacci(int n)
	{
		if(n<=0)
		return 0;
		if(n==1||n==2)
		return 1;
		return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
	}
}
