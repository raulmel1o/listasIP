class Exec17 {
	public static void main(String[] args) {
		System.out.println(isPower(32));
		System.out.println(isPower(31));
		System.out.println(isPower(64));
	}
	
	public static boolean isPower(int num) {
		double log = Math.log(num) / Math.log(2);
		int res = (int) log;
		if (res == log) {
			return true;
		}
		return false;
	}
}