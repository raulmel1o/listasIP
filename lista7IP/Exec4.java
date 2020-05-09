//finalizado

class Exec4 {
	public static void main(String[] args) {
		System.out.println(palindromo("ovo"));
		System.out.println(palindromo("osso"));
		System.out.println(palindromo("arara"));
		System.out.println(palindromo("olhar"));
	}
	
	public static boolean palindromo(String a) {
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}