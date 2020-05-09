//finalizado

import java.util.Scanner;

class Exec18 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] num = new int[50];
		int input = 0;
		int n = 0;
		int len = 0;
		
		do {
			input = in.nextInt();
			num[n] = input;
			n++;
		} while(input != -1);
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] == -1) {
				len = i;
				break;
			}
		}
		
		for (int j = len - 1; j >= 0; j--) {
			System.out.println(num[j]);
		}
	}
}