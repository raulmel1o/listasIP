//finalizado

public class Exec4 {
    public static void altera(int[][] mat){
        int great = -1000;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] > great) {
                    great = mat[i][j];
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = mat[i][j] / great;
            }
        }
    }
    public static void main(String[] args){
        int[][] matriz = {{1,4,3,6},{7,4,5,6},{2,7,4,2},{0,4,8,2}};

        altera(matriz);
    }
}
