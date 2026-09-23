package caixa_eletronico;

public class caixa {
    double saldo_disponivel = 5000;
    double limiteMaximoSaque = 1000;

    public void sacarDinheiro(double valorSolicitado) {
        if (valorSolicitado > limiteMaximoSaque) {
            System.out.println("Erro: O limite por saque é de RS " + limiteMaximoSaque);
            return;
        }
        if (valorSolicitado > saldo_disponivel) {
            System.out.println("Erro: Caixa eletronico sem notas o suficiente");
            return;
        }
        if (valorSolicitado <= 0) {
            System.out.println("Erro: Valor de saque inválido");
            return;
        }

        saldo_disponivel = saldo_disponivel - valorSolicitado;
        System.out.println("Saque de R$ " + valorSolicitado + " realizado com sucesso!");

    }
}


