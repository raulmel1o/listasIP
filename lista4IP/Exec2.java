//finalizado

public class Exec2 {
    public static void bySeven (int[] arr) {
        for (int i : arr) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main (String[] args) {
        int[] test = {2,14,63,5,35,42};
        bySeven(test);
    }
}