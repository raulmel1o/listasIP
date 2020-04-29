public class Exec25 {
    public static void tab (int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                int calc = i * j;
                System.out.printf("%d ",calc);
            }
            System.out.println("");
        }
    }
    public static void main (String[] args) {
        tab(16);
    }
}