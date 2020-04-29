public class Exec22 {
    public static int fat (int num) {
        if (num == 0) {
            return 1;
        } else {
            return (num * fat(num - 1));
        }
    }
    /*
    public static int fat (int num) {
        int sum = 1;

        for (int i = num; i > 1; i--) {
            sum = sum * i;
        }

        return sum;
    }
    */
    public static void main (String[] args) {
        int res = fat(5);

        System.out.println(res);
    }
}