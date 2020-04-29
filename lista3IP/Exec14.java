public class Exec14 {
    public static void sq (int n, int m) {
        for (int comp = 0; comp <= n; comp++) System.out.print("*");
        System.out.println();
        
        for (int vert = 0; vert < m - 2; vert++) {
            System.out.print("*");
            for (int esp = 0; esp <= n - 2; esp++) System.out.print(" ");
            System.out.println("*");
        }

        for (int comp = 0; comp <= n; comp++) System.out.print("*");
        System.out.println();
    }
    public static void main (String[] args) {
        sq(5,5);
    }
}