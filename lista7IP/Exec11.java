//finalizado

class Exec11 {
	public static void main(String[] args) {
		String str = "Ola caro amigo";
		System.out.println("(a) " + blank(str));
		System.out.println("(b) " + a(str));
	}
	
	public static int blank(String a) {
		int n = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				n++;
			}
		}
		return n;
	}
	
	public static int a(String s) {
		int a = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
				a++;
			}
		}
		return a;
	}
}