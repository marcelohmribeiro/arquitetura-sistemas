public class Contrato implements Remuneravel{
    private float salarioBase;

    public Contrato(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public float remuneracao() {
        return this.salarioBase;
    }
}
