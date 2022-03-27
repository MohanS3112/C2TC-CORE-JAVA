package Assignment_2;
import java.util.Scanner;
public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		int number;
		number = obj.nextInt();
		int sum = 0;

		for(int i=0; i<=number; i++)
		{
			sum = sum+i;
		}
		System.out.println("The sum of natural number for Entered Number is: "+ sum);
	}

}
