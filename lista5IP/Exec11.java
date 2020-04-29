//finalizado

public class Exec11 {
    public static boolean magic (int[][] a) {
        boolean flag1 = true;
        boolean flag2 = true;
        int lastCol = 0;
        int firstCol = 0;
        int firstDiag = 0;
        int secondDiag = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                lastCol += a[j][i];
            }

            if (i != 0 && firstCol != lastCol) {
                flag1 = false;
                break;
            }

            firstCol = lastCol;

            lastCol = 0;

            firstDiag += a[i][i];
            secondDiag += a[i][a.length - 1 - i];
        }

        if (firstCol == firstDiag && firstCol == secondDiag && flag1) {
            flag2 = true;
        } else {
            flag2 = false;
        }

        return flag2;
    }
    public static void main (String[] args) {
        int[][] a = {
                {8,0,7},
                {4,5,6},
                {3,10,2}
        };
        System.out.println(magic(a));
    }
}
