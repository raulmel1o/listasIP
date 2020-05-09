class Exec22 {
	public static void main(String[] args) {
		System.out.println(Vowel.relMean("ola meu caro amigo"));
	}
}

class Vowel {
	private static char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	
	private static boolean isVowel(char c) {
		for (char ch : vowels) {
			if (ch == c) {
				return true;
			}
		}
		return false;
	}
	
	public static double relMean(String s) {
		s = s.toLowerCase();
		double nVow = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (isVowel(s.charAt(i))) {
				nVow++;
			}
		}
		
		return nVow / s.length();
	}
}