package leetcode_problems;

import java.util.Scanner;

public class Leetcode_Prob_9 {
     /* To find the GCD of an array find the smallest and 
        largest element in the array and then find GCD of the smallest and largest element*/
	 public static void main(String args[])
	 {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter first number:");
		 int a = scan.nextInt();
		 System.out.println("Enter second number:");
		 int b = scan.nextInt();
		 System.out.println("GCD of " + Math.min(a, b) + " and " + Math.max(a, b) + " is: "  + gcd1(a,b));
		 System.out.println("GCD of " + Math.min(a, b) + " and " + Math.max(a, b) + " is: "  + gcd2(a,b));
		 scan.close();
	 }
	 
	 static int gcd1(int a, int b)
	 {
		 while(a!=0&&b!=0&&a!=b)
		 {
			 if(a>b)
				 a=a-b;
			 else
				 b=b-a;
		 }
		 if(a==b||b==0)
			 return a;
		 else
			 return b;
	 }
	 
	 static int gcd2(int a, int b)
	 {
		 int res=1;
		 for(int i=1;i<=Math.min(a, b);i++)
		 {
			 if(a%i==0&&b%i==0)
				 res=i;
		 }
		 return res;
	 }
	}
