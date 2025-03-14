class CartaoCredito extends Pagamento {
    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " via cartão de crédito.");
    }

    @Override
    public void confirmarPagamento() {
        System.out.println("Pagamento confirmado.");
    }
}