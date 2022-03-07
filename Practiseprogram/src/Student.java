
public class Student {
	
	String name;
	int roll, age;
	
	public Student (String name, int roll, int age) {
		this.name = name;
		this.roll = roll;
		this.age = age;
		
	}

	public static void main(String[] args) {
		
		Student S1 = new Student ("Saimohan",31,25);
		Student S2 = new Student ("Avantika",32, 29);
		
		System.out.println(S1.name + " " + S1.roll + " " + S1.age);
		System.out.println(S2.name + " " + S2.roll + " " + S2.age);

	}

}
