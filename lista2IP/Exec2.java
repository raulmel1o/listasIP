import java.util.Scanner;

public class Exec2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		int a = input.nextInt();
		System.out.print("Enter b: ");
		int b = input.nextInt();
		System.out.print("Enter c: ");
		int c = input.nextInt();

		if (a > 0 && a < b) {
			c = 0;
		}
		
		System.out.printf("The c value is: %d\n", c); 
	}
}
