//finalizado

public class Exec6 {
    public static void mediaPonderada (double[] not, double[] pes) {
        double sumNot = 0;
        double pesNot = 0;

        for (int i = 0; i < not.length; i++) {
            sumNot += (not[i] * pes[i]);
            pesNot += pes[i];
        }

        double media = sumNot / pesNot;

        System.out.printf("%.2f\n",media);
    }
    public static void main (String[] args) {
        double[] notas = {10,8,7.4,3,4,2};
        double[] pesos = {1,6,2,5,3,4};

        mediaPonderada(notas, pesos);
    }
}