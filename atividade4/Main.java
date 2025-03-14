public class Main {
    public static void main(String[] args) {
        
        Funcionario[] funcionarios = {
            new Gerente("Alice", 8000),
            new Desenvolvedor("Bob", 5000)
        };

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionário: " + funcionario.nome);
            System.out.println("Bônus: R$ " + funcionario.calcularBonus());
        }

        
        Treinavel[] treinaveis = {
            new Gerente("Carlos", 8500),
            new Desenvolvedor("Diana", 5500)
        };

        for (Treinavel treinavel : treinaveis) {
            treinavel.realizarTreinamento();
        }
    }
}