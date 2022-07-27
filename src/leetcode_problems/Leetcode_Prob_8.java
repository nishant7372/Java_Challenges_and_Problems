package leetcode_problems;

import java.util.Scanner;

public class Leetcode_Prob_8 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.print("Enter a number:");
    int num = scan.nextInt();
    num = addDigits(num); 
    System.out.print("Result:" + num);
	}
    static int addDigits(int num) 
    {
        int c = count(0,num);
        while(c>1)
        {
         num = fun(0,num); 
         c = count(0,num);
        }
        return num;
    }
    
    static int fun(int sum,int num)
    {
        if(num==0)
        {
            return sum;
        }
        sum=sum+num%10;
        return fun(sum,num/10);
    }
    static int count(int c,int num)
    {
        if(num==0)
        {
            return c;
        }
        return fun(c+1,num/10);
    }
    
}
