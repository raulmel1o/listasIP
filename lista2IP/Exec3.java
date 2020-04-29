import java.util.Scanner;

public class Exec3 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		if (num < 4 || num > 10) {
			System.out.println("fora");
		}	
	}
}
