import java.util.Scanner;

public class Exec6 {
	public static int oMaior (int a, int b, int c) {
		int max1 = Math.max(a,b);
		int max2 = Math.max(b,c);
		int maxFinal = Math.max(max1,max2);

		return maxFinal;
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Insira valor de a: ");
		int a = input.nextInt();
		
		System.out.printf("Insira valor de b: ");
		int b = input.nextInt();

		System.out.printf("Insira valor de c: ");
		int c = input.nextInt();

		int maior = oMaior(a,b,c);
		System.out.printf("O maior numero eh %d.\n",maior);
	}
}
