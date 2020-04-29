public class Exec17 {
    public static boolean prime (int num) {
        boolean flag = false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void main (String[] args) {
        boolean res = prime(29);

        if (!res) {
            System.out.printf("The num is prime");
        } else {
            System.out.printf("The num is prime");
        }
    }
}