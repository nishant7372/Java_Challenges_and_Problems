package hackerrank_problems;

import java.util.Scanner;

public class Hackerrank_Prob_1 {
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a String:");
	String s = scan.nextLine();
	int[] arr = new int[10];
	check(s, arr, 0, 0);
	for(int i=0;i<10;i++)
		System.out.print(arr[i]+ " ");
	scan.close();
}

static void check(String s, int arr[], int i, int j)
{
	if(j==arr.length)
		return;
	if(i==s.length())
	{
		check(s, arr, 0, j+1);
	}
	else
	{
	if(s.charAt(i)==(char)j)
	{
		System.out.println("ex");
		arr[j]=arr[j]+1;
	}
	}
	check(s, arr, i+1, j);
	
}
}
