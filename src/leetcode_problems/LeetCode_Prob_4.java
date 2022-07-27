package leetcode_problems;

import java.util.Scanner;
//Prob - Duplicate Zeroes and shift the array
public class LeetCode_Prob_4 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of elements:");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++)
		arr[i] = scan.nextInt();
		fun(arr, 0);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		scan.close();
	}

	static void fun(int[] arr, int i)
	{
		if(i==arr.length||i==arr.length-1)
		return;
		if(arr[i]==0)
		{
		shift(arr, i, arr.length-1);
		fun(arr, i+2);
		}
		else
		fun(arr, i+1);
		
	}
	
	static void shift(int[] arr, int i, int j)
	{
		if(j==i)
		return;
		arr[j] = arr[j-1];
		shift(arr, i , j-1);
	    
	}
}
