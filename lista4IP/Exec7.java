//finalizado

public class Exec7 {
    public static boolean inv (int num) {
        boolean flag = false;
        String st1 = Integer.toString(num);
        int n = num;
        int len = st1.length();
        int sum = 0;
        
        for (int i = 1; i <= len; i++) {
            int resto = num % 10;
            
            int v1 = resto * (int) Math.pow(10,(len - i));

            num /= 10;

            sum += v1;
        }

        if (n == sum) {
            flag = true;
        }
        
        return flag;
    }
    public static void main (String[] args) {
        boolean res = inv(10);
        System.out.println(res);
    }
}