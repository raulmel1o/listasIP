import java.util.Scanner;

public class Exec14 {
    public static int[] calc(int[] pol1, int[] pol2){
        int len = pol1.length;
        int[] res = new int[len];

        for (int i = 0; i < len; i++) {
            res[i] = pol1[i] + pol2[i];
        }

        return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int grad = 1 + in.nextInt();
        int[] pol1 = new int[grad];
        int[] pol2 = new int[grad];

        for (int i = 0; i < grad; i++) {
            pol1[i] = in.nextInt();
        }

        for (int j = 0; j < grad; j++) {
            pol2[j] = in.nextInt();
        }

        int[] res = calc(pol1, pol2);

        for (int coef : res) {
            System.out.print(coef + " ");
        }

        in.close();
    }
}