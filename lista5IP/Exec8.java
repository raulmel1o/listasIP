//finalizado

public class Exec8 {
    public static int gr(int[][] a) {
        int res = 0;
        int t = 0;
        int g = -1000;

        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                t += a[j][i];
            }

            if (t > g) {
                g = t;
                res = i;
            }

            t = 0;
        }

        return res;
    }
    public static void main(String[] args) {
        int[][] a = {
                {2,4,5,10},
                {-3,8,5,1},
                {4,0,11,7}
        };

        System.out.println(gr(a));
    }
}
