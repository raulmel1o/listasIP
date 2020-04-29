public class Exec20 {
    public static boolean pfSquare (int num) {
        boolean flag = false;
        int sum = 0;
        double sq = Math.sqrt(num);

        for (int i = 1; i <= num; i = i + 2) {
            sum = sum + i;
            
            if (sum == num && sq - Math.floor(sq) == 0) {
                flag = true;
                break;
            }
        }

        return flag;
    }
    public static void main (String[] args) {
        boolean res = pfSquare(3);
        System.out.println(res);
    }
}