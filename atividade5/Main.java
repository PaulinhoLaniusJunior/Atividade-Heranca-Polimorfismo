public class Main {
    public static void main(String[] args) {
        try {
            MeioPagamento[] pagamentos = {
                new CartaoCredito(200.50),
                new Boleto(350.75),
                new Pix(100.00)
            };

            for (MeioPagamento pagamento : pagamentos) {
                pagamento.processarPagamento(((Pagamento) pagamento).valor);
                ((Pagamento) pagamento).confirmarPagamento();
                System.out.println("---");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}