public class Exec13 {
    public static void horiz () {
        for (int comp = 0; comp <= 10; comp++) System.out.print("*");
        System.out.println();
    }
    public static void lado () {
        for (int vert = 0; vert < 3; vert++) {
            System.out.print("*");
            for (int esp = 0; esp <= 8; esp++) System.out.print(" ");
            System.out.println("*");
        }
    }
    public static void main (String[] args) {
        horiz();
        lado();
        horiz();
    }
}