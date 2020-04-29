public class Exec28 {
    public static void cubo (int num) {
        int init = num * (num - 1) + 1;
        int sNum = init;
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum = sum + sNum;
            sNum = sNum + 2;
        }
        
        System.out.printf("%d \n",sum);
    }
    public static void main (String[] args) {
        cubo(6);
    }
}