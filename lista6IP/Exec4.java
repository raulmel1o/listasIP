class Inteiro {
    int valor = 0;

    void carregaValor (int v) {
        this.valor = v;
    }

    int devolveValor () {
        return valor;
    }

    int devolveValorAbsoluto () {
        return Math.abs(valor);
    }

    void imprime () {
        System.out.println(valor);
    }

    int soma (int v) {
        this.valor += v;
        return valor;
    }

    int subtrai (int v) {
        this.valor -= v;
        return valor;
    }

    int multiplicaPor (int v) {
        this.valor *= v;
        return valor;
    }

    int dividePor (int v) {
        if (v != 0) {
            this.valor /= v;
            return valor;
        } else {
            System.out.println("ERRO");
        }
        return valor;
    }
}

public class Exec4 {
    //Similar à classe TestaInteiro
    public static void main (String[] args) {
        Inteiro teste = new Inteiro();
        teste.carregaValor(1_000);
        System.out.println(teste.devolveValor());
        System.out.println(teste.devolveValorAbsoluto());
        teste.soma(200);
        teste.subtrai(2_000);
        teste.imprime();
        System.out.println(teste.devolveValorAbsoluto());
        teste.multiplicaPor(2);
        System.out.println(teste.dividePor(0));
        System.out.println(teste.dividePor(2));

    }
}
