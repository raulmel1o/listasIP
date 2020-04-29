import java.util.Scanner;

public class Exec4 {
	public static final int ANTECIPADO = 0;
	public static final int NORMAL = 1;

	public static double valorAcad (int modo, double horas, double valor) {
		double total;
	
		if (modo == 0) {
			total = 0.97 * horas * valor;
			return total;
		} else if (modo == 1) {
			total = horas * valor;
			return total;
		} else {
			return -1.0;
		}
	}

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int modo;
		
		do {
			System.out.println("Insira o modo (0 = Antecipado, 1 = Normal): ");
			modo = input.nextInt();
		} while (!(modo == 0 || modo == 1));
	
		System.out.println("Insira o numero de horas: ");
		double horas = input.nextDouble();

		System.out.println("Insira o valor das aulas: ");
		double valor = input.nextDouble();

		double x = valorAcad(modo, horas, valor);
		System.out.printf("O valor é %.2f reais. \n", x);	
	}
}
