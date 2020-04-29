//finalizado

public class Exec1 {
    public static float greaterVal (float[] arr) {
        float max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
    public static void main (String[] args) {
        float[] test = {1.02F,5.332F,5.3321F,4.0987F,1.021F};
        float res = greaterVal(test);
        System.out.println(res);
    }
}