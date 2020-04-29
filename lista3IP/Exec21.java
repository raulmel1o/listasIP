public class Exec21 {
    public static void draw (int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("+");
            }
            System.out.print(":");
            for (int k = num; k > i; k--) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        draw(5);
    }
}