public class Quadrado extends FormaGeometrica{
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }
}
