//finalizado

public class Exec7 {
    public static int det2x2(int[][] m) {

        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static void det(int[][] m) {
        int a = m[0][0];
        int b = m[0][1];
        int c = m[0][2];

        int [][] efhi = {
                { m[1][1], m[1][2] },
                { m[2][1], m[2][2] },
        };
        int [][] dfgi = {
                { m[1][0], m[1][2] },
                { m[2][0], m[2][2] },
        };
        int [][] degh = {
                { m[1][0], m[1][1] },
                { m[2][0], m[2][1] },
        };

        int res = (
                a * det2x2(efhi)
                - b * det2x2(dfgi)
                + c * det2x2(degh)
                );

        System.out.println(res);
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,19}};

        det(a);
    }
}
