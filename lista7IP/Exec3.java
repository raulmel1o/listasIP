//finalizado

class Exec3 {
	public static void main(String[] args) {
		System.out.println(primLet("Bota na cabeca que estilo nao e marra"));
	}
	
	public static String primLet(String a) {
		String res = "";
		res += a.charAt(0);
		
		for (int i = 1; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				res += a.charAt(i + 1);
			}
		}
		return res;
	}
}