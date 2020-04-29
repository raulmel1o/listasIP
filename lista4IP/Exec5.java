//finalizado

public class Exec5 {
    public static void notes (int[] arr) {
        double min = arr[0];
        double max = arr[0];
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }

        double med = (sum - min - max) / arr.length;

        System.out.printf("%.2f\n",med);
    }
    public static void main (String[] args) {
        int[] test = {9,6,4,4,9,7};
        notes(test);
    }
}