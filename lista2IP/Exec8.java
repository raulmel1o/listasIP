import java.util.Scanner;

public class Exec8 {
	public static int maiorData (int dia1, int mes1, int ano1, int dia2, int mes2, int ano2) {
		int maior = 0;		

		if (ano1 < ano2) {
			maior = 1;
		} else if (ano1 > ano2) {
			maior = 2;
		} else {
			if (mes1 < mes2) {
				maior = 1;
			} else if (mes1 > mes2) {
				maior = 2;
			} else {
				if (dia1 < dia2) {
					maior = 1;
				} else if (dia1 > dia2) {
					maior = 2;
				}
			}
		}
		return maior;
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Data 1: \n");
		System.out.printf("Insira o dia: ");
		int dia1 = input.nextInt();
		System.out.printf("Insira o mes: ");
		int mes1 = input.nextInt();
		System.out.printf("Insira o ano: ");
		int ano1 = input.nextInt();

		System.out.printf("Data 2: \n");
		System.out.printf("Insira o dia: ");
		int dia2 = input.nextInt();
		System.out.printf("Insira o mes: ");
		int mes2 = input.nextInt();
		System.out.printf("Insira o ano: ");
		int ano2 = input.nextInt();

		int maior = maiorData (dia1, mes1, ano1, dia2, mes2, ano2);
		
		if (maior == 1) {
			System.out.printf("A data 1 é a maior.\n");
		} else {
			System.out.printf("A data 2 é a maior.\n");
		}
	}
}
