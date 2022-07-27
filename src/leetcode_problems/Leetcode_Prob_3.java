package leetcode_problems;

import java.util.Scanner;
//Prob. - Find Numbers with even no. of digits
public class Leetcode_Prob_3 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of elements:");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++)
		arr[i] = scan.nextInt();
		System.out.println("Elements with even Digits: ");
		System.out.println("Count: " + fun(arr,0, 0));
		scan.close();
	}

	static int fun(int[] arr, int i, int c)
	{
		if(i==arr.length)
		return c;
		int x = arr[i];
		int j = count(x, 0);
		if(j%2==0)
		{	
		System.out.println(x);
	    return fun(arr, i+1,c+1);
		}
		else
		return fun(arr, i+1,c);
	}
	
	static int count(int x, int c)
	{
		if(x==0)
		return c;
		return count(x/10, c+1);
	}
}
