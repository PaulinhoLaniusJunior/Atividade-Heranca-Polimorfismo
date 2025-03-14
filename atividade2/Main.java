public class Main {
    public static void main(String[] args) {
        try {
            
            Animal[] animais = {new Cachorro(), new Gato()};
            for (Animal animal : animais) {
                System.out.println("Som do animal: " + animal.emitirSom());
            }

            
            Veiculo[] veiculos = {new Carro(), new Moto()};
            for (Veiculo veiculo : veiculos) {
                veiculo.acelerar();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante os testes: " + e.getMessage());
        }
    }
}