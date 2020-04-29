//finalizado

import java.util.Scanner;

public class Exec13 {
    public static double calc(int[]pol,int x){
        double res = 0;

        for (int i = 0; i < pol.length; i++) {
            res += pol[i] * i * Math.pow(x, i-1);
        }

        return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int grad = 1 + in.nextInt();
        int[] pol = new int[grad];

        for (int i = 0; i < grad; i++) {
            pol[i] = in.nextInt();
        }

        double res = calc(pol, x);
        System.out.println(res);

        in.close();
    }
}