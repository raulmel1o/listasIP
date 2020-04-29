public class Exec15 {
    public static void f (int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
    public static void wh (int n) {
        int i = 0;
        while (i < n) {
            System.out.print("*");
            i++;
        }
    }
    public static void dw (int n) {
        int i = 0;
        do {
            System.out.print("*");
            i++;
        } while (i < n);
    }
    public static void main (String[] args) {
        f(1);
        wh(2);
        dw(3);
    }
}