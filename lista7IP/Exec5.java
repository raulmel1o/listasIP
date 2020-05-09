//finalizado

class Exec5 {
	public static void main(String[] args) {
		System.out.println(rev("Olhar para voces"));
	}
	
	public static String rev(String a) {
		String res = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			res += a.charAt(i);
		}
		return res;
	}
}