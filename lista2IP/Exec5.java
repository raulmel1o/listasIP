import java.util.Scanner;

public class Exec5 {
	public static double valorEletro (double preco, int modo) {
		double aPagar = 0;
	
		switch (modo) {
			case 0 : aPagar = preco;
			break;
			case 1 : aPagar = preco * 1.1;
			break;
			case 2 : aPagar = preco * 1.2;
			break;
		}
		return aPagar;
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);	
		int modo;

		do {
			System.out.printf("Escolha um modo de pagamento:\nA vista = 0\n2x = 1\n3x = 2\n");
			modo = input.nextInt();
		} while (!(modo == 0 || modo == 1 || modo == 2));

		System.out.printf("Insira o valor do eletrodomestico: ");
		double preco = input.nextDouble();

		double valor = valorEletro(preco, modo);
		System.out.printf("O valor a ser pago eh %.2f.\n", valor);
	}
}
