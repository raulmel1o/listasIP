import java.util.Scanner;

public class Exec10 {
	public static int categoria (double valor) {
		int categoria = 0;

		if (62 <= valor && valor <= 118)  categoria = 0;
		else if (119 <= valor && valor <= 153)  categoria = 1;
		else if (154 <= valor && valor <= 177)  categoria = 2;
		else if (178 <= valor && valor <= 209)  categoria = 3;
		else if (210 <= valor && valor <= 249)  categoria = 4;
		else if (valor >= 249)  categoria = 5;
		else categoria = -1;

		return categoria;
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Insira a velocidade dos ventos: ");
		double valorocidade = input.nextDouble();
		
		int cat = categoria (valorocidade);
		System.out.printf("Estes eh um ciclone de categoria %d.\n", cat);
	}
}
