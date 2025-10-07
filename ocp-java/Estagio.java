public class Estagio implements Remuneravel{
    private float bolsaAuxilio;

    public Estagio(float bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public float remuneracao() {
        return this.bolsaAuxilio;
    }
}
