import java.util.Scanner;
public class nprandncr {

public static int fact(int num) {
		// Calculating a factorial of a number
		int fact = 1, i;
		for(i=1; i<=num; i++) {
			fact = fact*i;
		}
		return fact;
		}
	public static void main(String args[]) {
		int n,r;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Value of n : ");
		n = scan.nextInt();
		System.out.print("Enter Vakue of r : ");
		r = scan.nextInt();
		System.out.print("NCR = "+(fact(n)/(fact(n-r)*fact(r))));
		System.out.print("NPR = "+(fact(n)/(fact(n-r))));
	}
}
