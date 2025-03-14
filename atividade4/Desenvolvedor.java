class Desenvolvedor extends Funcionario implements Treinavel {
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.10;
    }

    @Override
    public void realizarTreinamento() {
        System.out.println(nome + " realizou: Treinamento de programação.");
    }
}