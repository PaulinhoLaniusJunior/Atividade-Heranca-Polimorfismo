public class Main {
    public static void main(String[] args) {
        try {
            
            Forma[] formas = {new Circulo(5), new Retangulo(4, 6)};
            for (Forma forma : formas) {
                System.out.println("Área: " + forma.calcularArea());
            }

            
            Trabalhador[] trabalhadores = {new Engenheiro(), new Professor()};
            for (Trabalhador trabalhador : trabalhadores) {
                trabalhador.trabalhar();
                trabalhador.receberSalario();
            }
        } catch (Exception e) {
            System.out.println("Erro durante os testes: " + e.getMessage());
        }
    }
}