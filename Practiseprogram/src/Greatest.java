import java.util.scanner;

class Greatest{

	public static void main(String[] args){
		Scanner myobj = new Scanner(System.in);
	
		System.out.println("Enter the firstnumber");
		System.out.println("Enter the second number");
	
		int firstNumber = myobj.nextInt();
		int secondNumber = myobj.nextInt();
	
		if(firstNumber > secondNumber){
		System.out.println("The " + firstNumber + " is greater than second Number");
		
		if(secondNumber > firstNumber){
		System.out.println("The " + secondNumber + "is greater than first Number");

		}
	}
	}
}