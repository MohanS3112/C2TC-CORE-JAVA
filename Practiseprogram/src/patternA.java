import java.util.Scanner;
public class patternA {
	// java program to print alphabet A pattern
	
	void display(int n) {
		// outer for loop for number of lines
		for (int i = 0; i<=n; i++) {
			//Inner for loop for logic execution
			for (int j = 0; j<= n / 2; j++) {
				//print two column lines 
				if ((j == 0 || j == n / 2) && i != 0 || i == 0 && j != n / 2 || i == n /2)
						System.out.print("*");
				else 
					System.out.print(" ");
				}
					System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		patternA a = new patternA();
		a.display(7);

	}

}
