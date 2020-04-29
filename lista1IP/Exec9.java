import java.util.Scanner;

public class Exec9 {
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);

			System.out.println("Insira o time:");
			String time = myObj.nextLine();
			System.out.println("Insira o número do jogador:");
			int jogador = myObj.nextInt();
			System.out.println("Insira o número de cartões amarelos:");
			int nAmarelo = myObj.nextInt();
			System.out.println("Insira o número de cartões vermelhos:");
			int nVermelho = myObj.nextInt();

		double valor = calculo (jogador,nAmarelo,nVermelho);
		
		System.out.println("O time " + time + " vai pagar " + valor + " reais, pois o jogador número " + jogador + " recebeu " + nAmarelo + " cartões amarelos e " + nVermelho + " cartões vermelhos."); 
	}
	public static double calculo (int jogador,int nAmarelo,int nVermelho) {
		double multa = (nAmarelo * 1000.20) + (nVermelho * 4523.75);
		return multa;
	}
}
