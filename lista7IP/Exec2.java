//finalizado

class Exec2 {
	public static void main(String[] args) {
		System.out.println(position("Olá", 'á'));
	}
	
	public static int position(String a, char c) {
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == c) {
				return i;
			}
		}
		return -1;
	}
}