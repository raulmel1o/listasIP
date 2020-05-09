//finalizado

class Exec12 {
	public static void main(String[] args) {
		System.out.println(min(new double[] {10,2,5,1,-10}));
		System.out.println(max(new double[] {10,2,5,1,-10}));
	}
	
	public static double min(double[] a) {
		double min = 100000;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	
	public static double max(double[] a) {
		double max = -100000;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
}