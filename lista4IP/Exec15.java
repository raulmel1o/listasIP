//finalizado

import java.util.Scanner;

public class Exec15 {
    public static int calc(int[] arr1, int[] arr2){
        int res = 0;
        int pot = 0;
        int num1 = 0;
        int num2 = 0;

        pot = arr1.length - 1;

        for (int i = 0; i < arr1.length; i++) {
            num1 += arr1[i] * Math.pow(10, pot);
            pot--;
        }

        System.out.println(num1);

        pot = arr2.length - 1;

        for (int j = 0; j < arr2.length; j++) {
            num2 += arr2[j] * Math.pow(10, pot);
            pot--;
        }

        System.out.println(num2);

        res = num1 + num2;

        return res;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] seq1 = new int[n];
        int m = in.nextInt();
        int[] seq2 = new int[m];

        for (int i = 0; i < n; i++) {
            seq1[i] = in.nextInt();
        }

        for (int j = 0; j < m; j++) {
            seq2[j] = in.nextInt();
        }

        int res = calc(seq1, seq2);

        System.out.println(res);

        in.close();
    }
}