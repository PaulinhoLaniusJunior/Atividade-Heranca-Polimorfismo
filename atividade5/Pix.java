class Pix extends Pagamento {
    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " via Pix.");
    }

    @Override
    public void confirmarPagamento() {
        System.out.println("Pagamento instantâneo confirmado.");
    }
}