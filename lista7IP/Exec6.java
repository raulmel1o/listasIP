//finalizado

class Exec6 {
	public static void main(String[] args) {
		System.out.println(copy("Olá"));
	}
	
	public static String copy(String a) {
		String res = "";
		for (int i = 0; i < a.length(); i++) {
			res += a.charAt(i);
		}
		return res;
	}
}