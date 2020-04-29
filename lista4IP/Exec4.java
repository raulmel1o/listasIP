//finalizado

public class Exec4 {
    public static void minMax (int[] arr) {
        int min = arr[0];
        int max = arr[0];

        int posMin = 0;
        int posMax = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                posMin = i;
            }
            if (arr[i] >= max) {
                max = arr[i];
                posMax = i;
            }
        }

        System.out.printf("Min: %d\n",posMin);
        System.out.printf("Max: %d\n",posMax);
    }
    public static void main (String[] args) {
        int[] test = {3,1,2,45,6,9,45,3,2,5,2,3,1};

        minMax(test);
    }
}