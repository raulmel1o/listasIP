public class Exec16 {
    public static double calc (double interest, double invInitial, int months) {
        //investment calculator
        double calc = invInitial * Math.pow((1 + interest),(months - 1)) * (1 + interest) / invInitial * Math.pow((1 + interest), months);

        return calc;
    }
    public static void main (String[] args) {
        double result = calc(0.011,1000,10);
        
        System.out.printf("%.2f\n",result);
    }
}

/*

    n meses
    r juros
    a inv inicial

    a * (1 + r) ^ (n - 1) * (1 + r) = a * (1 + r) ^ n

*/