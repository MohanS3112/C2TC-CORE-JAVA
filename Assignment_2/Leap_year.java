package Assignment_2;

import java.util.Scanner;
public class Leap_year{

	public static void main(String[] args){

	int year;
	System.out.println("Enter the Year: ");
	Scanner sc = new Scanner(System.in);
	year = sc.nextInt();
	
	
	if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
		System.out.println("The year is a leap year.");
	else
		System.out.println("The year is a not Leap Year,");

	}
}
