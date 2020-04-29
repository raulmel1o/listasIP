//finalizado

public class Exec9 {
    public static void trans (int[][] a) {
        int rows = a.length;
        int col = a[0].length;

        int[][] b = new int[col][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                b[j][i] = a[i][j];
            }
        }

        System.out.printf("%d %d\n",b[0][0],b[0][1]);
        System.out.printf("%d %d\n",b[1][0],b[1][1]);
    }
    public static void main (String[] args) {
        int[][] a = {
                {1,2},
                {3,4}
        };
        trans(a);
    }
}
