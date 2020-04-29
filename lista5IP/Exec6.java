//finalizado

public class Exec6 {
    public static void mult(int[][] a, int[][] b) {

        int c[][] = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = 0;

                for (int k = 0; k < a.length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }

                System.out.print(c[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = {{0,1},{4,5}};
        int[][] mat2 = {{10,6},{9,1}};

        mult(mat1,mat2);
    }
}
