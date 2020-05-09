//finalizado

import java.util.Scanner;

class Exec9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			String s = in.next();
			
			char c1 = s.charAt(0);
			char c2 = s.charAt(1);
			char c3 = s.charAt(2);
			
			if (c1 < c2 && c2 < c3 && c1 < c3) {
				System.out.println("Crescente");
			} else if (c1 > c2 && c2 > c3 && c1 > c3) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Desordenado");
			}
		}
	}
}