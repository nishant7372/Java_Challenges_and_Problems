package coreJavaChallenges_Srinivas;

import java.util.Random;

public class challenge4 {
public static void main(String[] args) {
	
	Random r = new Random();
	int c=1, n=1;
	
	System.out.println("Random number between 100 to 200");
	for(int j=0;j<32767;j++)
	{
		int i = r.nextInt(200);
		if(i>100 && c<=20)
		{
		   System.out.println(n +": "+ i);
		   c++;
		   n++;
	    }
	}
	
}
}
