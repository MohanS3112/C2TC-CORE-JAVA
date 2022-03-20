import java.util.Scanner

class Square{
	public static void main(String[] args){
	Scanner myobj = new Scanner(System.in);
	

	System.out.println("Enter the length");
	System.out.println("Enter the breadth");
	
	int length = myobj.nextInt();
	int breadth = myobj.nextInt();
	

	if(length==breadth){
	System.out.println("It is square.");
}
	else{
	System.out.println("It is not a square.");
	}
}
}