//finalizado

public class Exec2 {
    public static int secsum(int[][] mat){
        int res = 0;
        boolean sq = false;
        int len = mat.length - 1;

        if (mat.length == mat[0].length) {
            sq = true;
        }

        if (sq) {
            for (int i = 0; i < mat.length; i++) {
                int j = len - i;
                res += mat[i][j];
            }
        }

        return res;
    }

    public static void main(String[] args){
        int[][] matriz = { {2, 5, 10, 4}, {-3, 8, 1, 5}, {4, 0, 7, 11}, {3, -4, 1, 2} };
        System.out.println(secsum(matriz));
    }
}
