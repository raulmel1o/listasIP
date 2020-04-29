//finalizado

public class Exec1 {
    public static int[] index(int[][] matriz){
        int[] res = {0, 0};
        int num = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] > num){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }

        return res;
    }

    public static int greater(int[][] matriz){
        int num = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] > num){
                    num = matriz[i][j];
                }
            }
        }

        return num;
    }
    public static void main(String[] args){
        int[][] matriz = {{0,1},{2,3},{8,1}};
        int[] res = index(matriz);

        System.out.println(greater(matriz));

        for (int i : res){
            System.out.print(i);
        }
    }
}
