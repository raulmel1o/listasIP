public class Exec8 {
    public static void main (String[] args) {
        for (int i = 1; i <= 15; i++) {
            int num = i;
            int sq = (int) Math.pow(i,2);
            int cubo = (int) Math.pow(i,3);
            System.out.printf("%d \t %d \t %d \n",num,sq,cubo);
        }
    }
}