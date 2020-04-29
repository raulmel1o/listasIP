public class Exec7 {
    public static void main (String[] args) {
        System.out.print("(a)");
        int num1 = 3;
        while (num1 <= 48) {
            System.out.printf(" %d ",num1);
            num1 = num1 + 5;
        }
        System.out.println();

        System.out.print("(b)");
        int num2 = -2;
        while (num2 <= 43) {
            System.out.printf(" %d ",num2);
            num2 = num2 + 5;
        }
        System.out.println();

        System.out.print("(c)");
        int num3 = 48;
        while (num3 >= 3) {
            System.out.printf(" %d ",num3);
            num3 = num3 - 5;
        }
        System.out.println();
    }
}