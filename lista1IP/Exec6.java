import java.util.Scanner;

public class Exec6 {
	public static void main (String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Insira o valor em reais:");
		double valorReais = myObj.nextDouble();
		
		double taxaConversao = 4.74;
		double valorDolar = valorReais * taxaConversao;
		System.out.println(valorDolar);
	}
}

