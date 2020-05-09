//finalizado

import java.util.Scanner;

class Exec10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String resp = "";
		System.out.println("S: Sim | N: Não");
		
		do {
			resp = in.next();
			
			double real = in.nextDouble();
			
			if (real < 0) {
				real *= -1;
			}
			
			System.out.println(real);
		} while (resp.equals("S"));
	}
}