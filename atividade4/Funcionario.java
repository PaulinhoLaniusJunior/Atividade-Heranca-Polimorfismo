abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    // Construtor
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Método abstrato para calcular o bônus
    public abstract double calcularBonus();
}