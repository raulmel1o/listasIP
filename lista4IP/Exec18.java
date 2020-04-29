//finalizado

import java.util.Scanner;

public class Exec18 {
    public static int greater(int[] arr) {
        int res = 0;
        int great = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > great) {
                res = i;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int len = in.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }

        int res = greater(arr);

        System.out.println(res);

        in.close();
    }
}