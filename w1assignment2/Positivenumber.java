package w1assignment2;
import java.util.Scanner;
public class Positivenumber {

		public static void main(String[] args) {
			Scanner a = new Scanner(System.in);
			int b;
			System.out.println("Enter the value:");
			System.out.println("");
			b=a.nextInt();
			if(b<0)
			{
				System.out.println("The given number is Negative: "+b);
				int c,d=-1;
				c=b*d;
				System.out.println("The" +" "+ b +" "+ "converted Negative: "+c);
			}
			else
				System.out.println("The given number is Positive: "+b);
		}

}
