public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    private void ajustarSaldo(double valor) {
        // Este método só pode ser chamado dentro da classe ContaBancaria
        saldo += valor;
    }
}
