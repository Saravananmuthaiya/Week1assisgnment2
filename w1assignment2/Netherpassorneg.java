package w1assignment2;

import java.util.Scanner;

public class Netherpassorneg {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int b;
		System.out.println("Enter the value:");
		System.out.println("");
		b=a.nextInt();
		if(b<0)
		{
			System.out.println("The given number is Negative: "+b);
		}
		else
			if(b>0)
			{
				System.out.println("The given number is Positive: "+b);
			}
			
			else 
				if(b==0)
			System.out.println("The given number is nether positive or nagative: "+b);
	}
}
