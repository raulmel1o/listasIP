public class Exec26 {
    public static void triang (int line) {
        int sum = 0;

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + 1;
                System.out.printf("%d \t",sum);
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        triang(10);
    }
}