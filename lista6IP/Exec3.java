//finalizado

public class Exec3 {
    public static void main (String[] args) {
        int[] test = {1,4,6,2,3};

        Simples s = new Simples();
        System.out.println(s.estaNoArranjo(test, 3));
        System.out.println(s.inicializaArranjo(test,9));
        System.out.println(s.estaNoArranjo(test, 3));
        System.out.println(s.estaNoArranjo(test, 9));
        s.imprimeArranjo(test);
    }
}

class Simples {
    int inicializaArranjo(int[] a, int v) {
        for (int i = 0; i < a.length; i++) {
            a[i] = v;
        }
        return a.length;
    }

    void imprimeArranjo (int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
    }

    boolean estaNoArranjo (int[] a, int v) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == v) {
                return true;
            }
        }
        return false;
    }
}