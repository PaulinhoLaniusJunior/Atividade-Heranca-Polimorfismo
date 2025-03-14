class Gerente extends Funcionario implements Treinavel {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.20;
    }

    @Override
    public void realizarTreinamento() {
        System.out.println(nome + " realizou: Treinamento de liderança.");
    }
}