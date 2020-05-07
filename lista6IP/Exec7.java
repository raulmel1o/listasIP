//finalizado

public class Exec7 {
    public static void main (String[] args) {
        Complexo num1 = new Complexo();
    }
}

class Complexo {
    double[] a = new double[2];
    double[] b = new double[2];

    Complexo () {
        for (int i = 0; i < 2; i++) {
            a[i] = 0;
            b[i] = 0;
        }
    }

    Complexo (double[] a) {
        for (int i = 0; i < 2; i++) {
            this.a[i] = a[i];
            this.b[i] = a[i];
        }
    }

    Complexo (double[] a, double[] b) {
        for (int i = 0; i < 2; i++) {
            this.a[i] = a[i];
            this.b[i] = b[i];
        }
    }

    double[] soma () {
        double[] res = {0,0};
        res[0] = a[0] + b[0];
        res[1] = a[1] + b[1];
        return res;
    }
    double[] sub () {
        double[] res = {0,0};
        res[0] = a[0] - b[0];
        res[1] = a[1] - b[1];
        return res;
    }
    double[] mult () {
        double[] res = {0,0};
        res[0] = a[0] * b[0] - a[1] * b[1];
        res[1] = a[0] * b[1] + a[1] * b[0];
        return res;
    }
    double[] div () {
        double[] res = {0,0};
        res[0] = (a[0] * b[0] + a[1] * b[1]) / (Math.pow(b[0], 2) + Math.pow(a[1], 2));
        res[1] = (a[1] * b[0] - a[0] * b[1]) / (Math.pow(b[0], 2) + Math.pow(a[1], 2));
        return res;
    }
}