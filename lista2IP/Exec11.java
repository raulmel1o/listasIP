import java.util.Scanner;

public class Exec11 {
	public static boolean divisor (int num1, int num2) {
		boolean div = num1 % num2 == 0;
		return div;
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.printf("Insira um inteiro: ");
		int num1 = input.nextInt();
		System.out.printf("Insira outro inteiro: ");
		int num2 = input.nextInt();
		
		boolean resultado = divisor (num1, num2);
		System.out.println(resultado);
	}
}
