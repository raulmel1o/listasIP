//finalizado

class Exec7 {
	public static void main(String[] args) {
		String[] test = toArr("as12; --- bbvvvdd  .:.: Ald");
		for (String w : test) {
			System.out.println(w);
		}
	}
	
	public static String[] toArr(String a) {
		int counter = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
			counter++;
			}
		}
		String[] w = new String[counter];
		int n = 0;
		String item = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				w[n] = item;
				n++;
				item = "";
				continue;
			}
			item += a.charAt(i);			
		}
		return w;
	}
}