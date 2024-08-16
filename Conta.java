abstract class Conta {
    protected double saldo;
    protected String numeroConta;

    public Conta(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract void sacar(double valor); // Método abstrato para sacar

    public double getSaldo() {
        return saldo;
    }
}

class ContaCorrente extends Conta {
    private double taxaOperacao = 0.1;

    public ContaCorrente(String numeroConta) {
        super(numeroConta);
    }

    @Override
    public void sacar(double valor) {
        saldo -= (valor + taxaOperacao); // Desconta taxa de operação
    }
}

class ContaPoupanca extends Conta {
    private double rendimentoMensal = 0.02;

    public ContaPoupanca(String numeroConta) {
        super(numeroConta);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor; // Saque sem taxa
    }

    public void aplicarRendimento() {
        saldo += saldo * rendimentoMensal;
    }
}

class ContaInvestimento extends Conta {
    private double taxaAdministracao = 0.05;

    public ContaInvestimento(String numeroConta) {
        super(numeroConta);
    }

    @Override
    public void sacar(double valor) {
        saldo -= (valor + taxaAdministracao); // Desconta taxa de administração
    }

    public void investir(double valor) {
        saldo += valor;
    }
}
