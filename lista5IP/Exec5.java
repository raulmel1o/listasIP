//finalizado

public class Exec5 {
    public static int[][] sum(int[][] mat1, int[][] mat2) {
        int[][] res = new int[mat1.length][mat1[0].length];

        boolean eq = mat1.length == mat2.length && mat1[0].length == mat2[0].length;

        if (eq) {
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[i].length; j++) {
                    res[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1,4},{3,2}};
        int[][] mat2 = {{2,5},{6,3}};

        int[][] sum = sum(mat1,mat2);
    }
}
