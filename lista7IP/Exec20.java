//finalizado

import java.util.Scanner;

class Exec20 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		String secondLine = "";
		int[] isDig = new int[input.length()];
		
		char ch[] = input.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				isDig[i] = 1;
			}
		}
		
		for (int j = 0; j < isDig.length; j++) {
			if (isDig[j] == 1) {
				secondLine += "^";
			} else {
				secondLine += " ";
			}
		}
		
		System.out.println(input);
		System.out.println(secondLine);
		
		
	}
}