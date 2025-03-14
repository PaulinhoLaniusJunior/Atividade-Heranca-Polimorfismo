abstract class Pagamento implements MeioPagamento {
    protected double valor;

    public Pagamento(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do pagamento deve ser maior que zero.");
        }
        this.valor = valor;
    }

    public abstract void confirmarPagamento();
}
