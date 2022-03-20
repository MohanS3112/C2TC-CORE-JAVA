import java.util.Scanner;

class Discount_purchased{

	public static void main(String[] args){

	Scanner myobj = new Scanner(System.in);
	
	System.out.println("Enter your price")
	System.out.println("Enter your discount")
		
	int price = myobj.nextInt();
	int discount = myobj.nextInt();
	int total = price * (discount/100)
	
	if(total > 1000){
	System.out.println("You got 10% Discount");
	System.out.println("your total is "+ total);
		}
	}
}