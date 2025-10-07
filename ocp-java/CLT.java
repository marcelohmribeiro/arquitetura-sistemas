public class CLT implements Remuneravel{
    private float salarioMensal;
    private float beneficios;

    public CLT(float salarioMensal, float beneficios) {
        this.salarioMensal = salarioMensal;
        this.beneficios = beneficios;
    }

    @Override
    public float remuneracao() {
        return salarioMensal + beneficios;
    }
}
