class Engenheiro implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Projetando sistemas");
    }

    @Override
    public void receberSalario() {
        System.out.println("Salário: R$ 10.000");
    }
}