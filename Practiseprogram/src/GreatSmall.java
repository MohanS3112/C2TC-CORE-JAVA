import java.util.Scanner;

public class GreatSmall{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		System.out.println("Enter Second Number: ");
		System.out.println("Enter Third Number: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
			
			if (a > b){
				System.out.println("The Greatest: "+a);

			}
			else if(b > c){
				System.out.println("The Greatest: "+b);

			}
			else if(c > a){
				System.out.println("The Greatest: "+c);
			}
		}
	}