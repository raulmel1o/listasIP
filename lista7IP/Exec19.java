//finalizado

import java.util.Scanner;

class Exec19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		String res = "";
		
		res += Character.toUpperCase(input.charAt(0));
		
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i - 1) == ' ' && input.charAt(i) != ' ') {
				res += Character.toUpperCase(input.charAt(i));
			} else {
				res += input.charAt(i);
			}
		}
		
		System.out.println(res);
	}
}