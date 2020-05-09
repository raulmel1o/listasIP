//finalizado

class Exec1 {
	public static void main(String[] args) {
		System.out.println(equal("oi", "oi"));
		System.out.println(equal("oi", "Oi"));
		System.out.println(equal("oi", "o"));
		System.out.println(equal("oi", "oia"));
		System.out.println(equal("oi", "oa"));
	}
	
	public static boolean equal(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}
}