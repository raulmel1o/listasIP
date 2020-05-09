//finalizado

import java.util.Scanner;

class Exec12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String resp = "";
		double sum = 0;
		int n = 0;
		
		do {
			resp = in.next();
			sum += in.nextDouble();
			n++;
		} while(resp.charAt(0) == 's');
		
		System.out.println(sum / n);
	}
}