public class Exec19 {
    public static void multi (int n, int m) {
        int calc = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                calc = i * j;
                System.out.printf("%d ",calc);
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        multi(5,5);
    }
}