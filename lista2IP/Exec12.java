import java.util.Scanner;

public class Exec12 {
	public static boolean exist (double a, double b, double hip) {
				
		return Math.pow(hip,2) == Math.pow(a,2) + Math.pow(b,2);
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Entre os catetos de um triângulo retângulo: \n");
		System.out.printf("Cateto a: ");
		double a = input.nextDouble();
		System.out.printf("Cateto b: ");
		double b = input.nextDouble();
		System.out.printf("Hipotenusa: ");
		double hip = input.nextDouble();

		boolean existe = exist (a, b, hip);
		if (existe) {
			System.out.printf("O triangulo existe.\n");
		} else {
			System.out.printf("O triangulo nao existe.\n");
		}
	}
}
