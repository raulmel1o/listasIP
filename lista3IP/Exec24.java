public class Exec24 {
    public static int twoSq (int num) {
        int result = 0;
        
        if (num < 0) {
            result = -1;
        } else {
            for (int i = 0; i <= num; i++) {
                if (Math.pow(2,i) == num) {
                    result = i;
                    break;
                } else {
                    result = -1;
                }
            }
        }
        return result;
    }
    public static void main (String[] args) {
        System.out.println(twoSq(63));
    }
}