import java.util.Scanner;

public class Weekday{
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your week number: ");
		int x = sc.nextInt();

			switch(x){
	
			case 1:
				x = 1;
				System.out.println("Its a Sunday");
				break;
			case 2:
				x = 2;
				System.out.println("Its a Monday");
				break;
			case 3:
				x = 3;
				System.out.println("Its a Tuesday");
				break;
			case 4:
				x = 4;
				System.out.println("Its a Wednesday");
				break;
			case 5:
				x = 5;
				System.out.println("Its a Thursday");
				break;
			case 6:
				x = 6;
				System.out.println("Its a Friday");
				break;
			case 7:
				x = 7;
				System.out.println("Its a Saturday");
				break;
			}
		}
	}