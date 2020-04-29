//finalizado

public class Exec3 {
    public static double[] a (double[] num1, double[] num2) {
        double a = num1[0];
        double b = num1[1];
        double c = num2[0];
        double d = num2[1];

        double[] sum = {(a + c), (b + d)};
        return sum;
    }
    public static double[] b (double[] num1, double[] num2) {
        double a = num1[0];
        double b = num1[1];
        double c = num2[0];
        double d = num2[1];

        double[] sub = {(a - c), (b - d)};
        return sub;
    }
    public static double[] c (double[] num1, double[] num2) {
        double a = num1[0];
        double b = num1[1];
        double c = num2[0];
        double d = num2[1];

        double[] mul = {(a * c) - (b * d), (a * d) + (b * c)};
        return mul;
    }
    public static double[] d (double[] num1, double[] num2) {
        double a = num1[0];
        double b = num1[1];
        double c = num2[0];
        double d = num2[1];

        double[] div = {((a * c - b * d) / c * c + d * d), ((a * d + b * c) / c * c + d * d)};
        return div;
    }
    public static double[] e (double[] num1) {
        double a = num1[0];
        double b = num1[1];

        double[] con = {a, -b};
        return con;
    }
    public static double[] f (double[] num1) {
        double a = num1[0];
        double b = num1[1];

        double[] mod = {Math.sqrt(a * a + b * b)};
        return mod;
    }
    public static void main (String[] args) {
        double[] n1 = {2,5};
        double[] n2 = {3,1};

        double[] arr = a(n1,n2);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}