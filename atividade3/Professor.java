class Professor implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Ensinando alunos");
    }

    @Override
    public void receberSalario() {
        System.out.println("Salário: R$ 5.000");
    }
}