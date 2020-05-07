//finalizado

class ConversorMonetario {
    double compra;
    double venda;

    void defineTaxaCompra (double t) {
        this.compra = t;
    }
    void defineTaxaVenda (double t) {
        this.venda = t;
    }
    void imprimeTaxas () {
        System.out.println(compra);
        System.out.println(venda);
    }
    double vendeDolar (double a) {
        return a * venda;
    }
    double compraDolar (double a) {
        return a / compra;
    }
}

public class Exec8 {
    //Similar a classe TestaConversorMonetario
    public static void main (String[] args) {
        ConversorMonetario teste = new ConversorMonetario();
        teste.defineTaxaCompra(5.40);
        teste.defineTaxaVenda(5.20);
        teste.imprimeTaxas();
        System.out.println(teste.vendeDolar(10));
        System.out.println(teste.compraDolar(10));
    }
}
