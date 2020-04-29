//Programa para cálculo do tempo de queda livre
import java.util.Scanner;

public class Exec7 {
	public static void main (String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Insira a altura em metros");
		//Entrada do valor da altura		
		double altura = myObj.nextDouble();
		//Aceleração da gravidade
		double aceleracao = 9.8;
		//Cálculo do tempo de queda
		double tempo = Math.sqrt( 2 * altura / aceleracao);

		System.out.println(tempo);
	}
}

