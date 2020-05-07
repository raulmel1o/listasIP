//finalizado

public class Exec11 {
    public static void main (String[] args) {

    }
}

class Rendimentos2 {
    double rendimentosPessoaFisica (double t) {
        return 0;
    }
    double rendimentosPessoaJuridica (double t) {
        return 0;
    }
    double rendimentosDeAplicacoesFinanceiras (double t) {
        return 0;
    }
    double rendimentosNaoTributaveis (double t) {
        return 0;
    }
    double totalDeRendimentosTributaveis () {
        return 0;
    }
}

class TabelaDeAliquotas2 {
    double aliquota (double r) {
        if (r < 22_847.76) {
            return 0;
        } else if (r < 33_919.80) {
            return 0.075;
        } else if (r < 45_012.60) {
            return 0.15;
        } else if (r < 55_976.16) {
            return 0.225;
        } else {
            return 0.275;
        }
    }
    double valorADeduzir (double r) {
        if (r < 22_847.76) {
            return 0;
        } else if (r < 33_919.80) {
            return 1_713.58;
        } else if (r < 45_012.60) {
            return 4_257.57;
        } else if (r < 55_976.16) {
            return 7_633.51;
        } else {
            return 10_432.32;
        }
    }
}

class CalculadoraDeImposto2 {
    

    double imposto () {
        return 0;
    }
}