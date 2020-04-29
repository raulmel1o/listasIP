import java.util.Scanner;

public class Exec7 {
	public static double conversor (double temp, int modo) {
		if (modo == 0) {
			temp = (temp * 9/5) + 32;	
		} else {
			temp = (temp - 32) * 5/9;
		}
		return temp;
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int modo;

		do {
		System.out.printf("Insira a unidade de temperatura (Celsius = 0, Fahrenheit = 1): ");
		modo = input.nextInt();
		} while (!(modo == 0 || modo == 1));
		
		System.out.printf("Insira a temperatura: ");
		double temp = input.nextDouble();

		double tempFim = conversor (temp,modo);

		if (modo == 0) {
			System.out.printf("A temperatura eh %.2f graus Fahrenheit.\n", tempFim);
		} else {
			System.out.printf("A temperatura eh %.2f graus Celsius.\n", tempFim);
		}
	}
}
