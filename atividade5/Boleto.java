class Boleto extends Pagamento {
    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Boleto gerado no valor de R$ " + valor + ".");
    }

    @Override
    public void confirmarPagamento() {
        System.out.println("Aguardando compensação.");
    }
}