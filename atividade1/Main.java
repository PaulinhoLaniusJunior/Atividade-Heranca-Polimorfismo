public class Main {
    public static void main(String[] args) {
        try {
            Calculadora calc = new Calculadora();

            // Testando os métodos somar
            System.out.println("Soma de dois inteiros: " + calc.somar(5, 10));
            System.out.println("Soma de dois decimais: " + calc.somar(5.5, 10.2));
            System.out.println("Soma de três inteiros: " + calc.somar(1, 2, 3));

            // Testando o comportamento polimórfico
            Operacao operacao = new Mensagem();
            operacao.executar();

            // Testando a classe Mensagem
            Mensagem msg = new Mensagem();
            msg.exibirMensagem();
            msg.exibirMensagem("Bem-vindo ao polimorfismo!");
            msg.exibirMensagem("Repetindo a mensagem", 3);

            // Testando exceção
            msg.exibirMensagem("Teste de erro", -1);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
