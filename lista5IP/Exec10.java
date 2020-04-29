//finalizado

public class Exec10 {
    public static int[][] trans (int[][] a) {
        int rows = a.length;
        int col = a[0].length;

        int[][] b = new int[col][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                b[j][i] = a[i][j];
            }
        }

        return b;
    }
    public static boolean eq (int[][] a, int[][] b) {
        boolean flag = true;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] != b[i][j]) {
                    flag = false;
                }
            }
        }

        return flag;
    }
    public static void main (String[] args) {
        int[][] a = {
                {1,1},
                {1,1}
        };
        int[][] res = trans(a);

        System.out.println(eq(a, res));
    }
}
