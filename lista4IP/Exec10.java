//finalizado
public class Exec10 {
    public static boolean sorted (int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) {
        int[] test = { 8, 10, 8, 6, 3 };
        boolean res = sorted(test);

        System.out.println(res);
    }
}