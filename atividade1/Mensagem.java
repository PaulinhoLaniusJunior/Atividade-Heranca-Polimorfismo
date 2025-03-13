public class Mensagem extends Operacao {

    // Método exibirMensagem: sem parâmetros
    public void exibirMensagem() {
        System.out.println("Olá, mundo!");
    }

    // Método exibirMensagem: com um parâmetro
    public void exibirMensagem(String texto) {
        System.out.println(texto);
    }

    // Método exibirMensagem: com dois parâmetros
    public void exibirMensagem(String texto, int repeticoes) {
        if (repeticoes < 0) {
            throw new IllegalArgumentException("O número de repetições não pode ser negativo.");
        }
        for (int i = 0; i < repeticoes; i++) {
            System.out.println(texto);
        }
    }

    @Override
    public void executar() {
        exibirMensagem();
    }
}