package leetcode_problems;

import java.util.Scanner;

public class Leetcode_Prob_7 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of elements:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[2];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		arr[i] = scan.nextInt();
		
		System.out.println("Enter the target:");
		int target = scan.nextInt();
		
		twosum(arr, arr2, 0, target);
		System.out.println("Indices of the numbers are:");
		for(int i=0; i<2;i++)
			System.out.print(arr2[i] + " ");
		System.out.println("\nElements with sum " + target + " are:");
		for(int i=0; i<2;i++)
			System.out.print(arr[arr2[i]] + " ");
		scan.close();
	}
	
	static int[] twosum(int arr[], int arr2[], int i, int target) 
	{
		if(i==arr.length)
		return arr2;
		int new_target = target - arr[i]; 
		int index2 = search(arr, new_target, i+1);
		if(index2!=0)
		{
			arr2[0]=i;
			arr2[1]=index2;
			return arr2;
		}
		return twosum(arr, arr2, i+1, target);
	}
	
	static int search(int arr[], int new_target, int i)
	{
		if(i==arr.length)
			return 0;
		if(arr[i]==new_target)
		{
		    return i;
		}
			return search(arr, new_target, i+1);
	}
}
