import java.util.Scanner;

public class Exec9 {
		
		
	public static double conversor (double valor, int modo) {
		double resultado = 0;
		
		switch (modo) {
			case 0 : resultado = (valor * 1760 * 3 * 12 * 25.3995) / 1000000;
			break;
			case 1 : resultado = (valor * 3 * 12 * 25.3995) / 1000000;
			break;
			case 2 : resultado = (valor * 12 * 25.3995) / 1000000;
			break;
			case 3 : resultado = (valor * 25.3995) / 1000000;
			break;
		}
		return resultado;
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int modo;
		
		do {
		System.out.printf("Insira a unidade de medida (Milhas = 0, Jardas = 1, Pes = 2, Polegadas = 3): ");
		modo = input.nextInt();
		} while (!(modo == 0 || modo == 1 || modo == 2 || modo == 3));

		System.out.printf("Insira o valor: ");
		double valor = input.nextDouble();

		double convert = conversor (valor, modo);
		System.out.printf("O valor em quilometros eh %f.\n", convert);
	}
}
