//finalizado

class Exec14 {
	public static void main(String[] args) {
		System.out.println(mean(new int[] {10,2,3,5,1}));
	}
	
	public static double mean(int[] a) {
		double sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum / a.length;
	}
}