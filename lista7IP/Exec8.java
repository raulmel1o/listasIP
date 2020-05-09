//finalizado

class Exec8 {
	public static void main(String[] args) {
		System.out.println(toFloat("1239,2"));
		System.out.println(toFloat("1.239,02"));
		System.out.println(toFloat("1.239,022"));
		System.out.println(toFloat("1.239,0247"));
	}
	
	public static float toFloat(String a) {
		String numero = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '.') {
				continue;
			} else if (a.charAt(i) == ',') {
				numero += ".";
			} else {
				numero += a.charAt(i);
			}
		}
		return Float.parseFloat(numero);
	}
}