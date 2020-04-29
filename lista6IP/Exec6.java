class Esfera {
    double raio;

    Esfera(double r) {
        this.raio = r;
    }

    double area () {
        return 4.0 * Math.PI * Math.pow(raio, 2);
    }

    double volume () {
        return 4.0 / 3.0 * Math.PI * Math.pow(raio, 3);
    }
}
public class Exec6 {
    public static void main (String[] args) {
        Esfera teste = new Esfera(5);
        Esfera teste2 = new Esfera(5.5);

        System.out.println(teste.area());
        System.out.println(teste2.area());
        System.out.println(teste.volume());
        System.out.println(teste2.volume());
    }
}
