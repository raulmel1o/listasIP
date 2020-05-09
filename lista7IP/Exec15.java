//finalizado

class Exec15 {
	public static void main(String[] args) {
		System.out.println(prime(new int[] {1,2,10,7}));
	}
	
	public static int prime(int[] a) {
		int n = 0;
		for (int i : a) {
			if (isPrime(i)) {
				n++;
			}
		}
		return n;
	}
	
	public static boolean isPrime(int a) {
		for (int i = 2; i < a/2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}