//finalizado

public class Exec3 {
    public static boolean perm(int[][] mat){
        boolean flag = true;
        int counter = 0;

        for (int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == 1) {
                    counter++;
                }
            }
            flag = counter < 2;
            if (!flag) {
                break;
            }
            counter = 0;
        }

        for (int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                if(mat[j][i] == 1) {
                    counter++;
                }
            }
            flag = counter < 2;
            if (!flag) {
                break;
            }
            counter = 0;
        }

        return flag;
    }
    public static void main(String[] args){
        int[][] matriz1 = {{1,0,0},{0,1,0},{0,0,1}};
        int[][] matriz2 = {{0,1,0},{0,1,0},{0,0,1}};
        int[][] matriz3 = {{0,1},{1,0}};

        System.out.println(perm(matriz1));
        System.out.println(perm(matriz2));
        System.out.println(perm(matriz3));


    }
}
