//finalizado

public class Exec9 {
    public static void main (String[] args) {
        Quadrante quad1 = new Quadrante();
        System.out.println(quad1.local());
        Quadrante quad2 = new Quadrante(0,0);
        System.out.println(quad2.local());
        Quadrante quad3 = new Quadrante(1,-1);
        System.out.println(quad3.local());
    }
}

class Quadrante {
    double x;
    double y;

    Quadrante () {
        this.x = 0;
        this.y = 0;
    }

    Quadrante (double x, double y) {
        this.x = x;
        this.y = y;
    }

    int local () {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }
}