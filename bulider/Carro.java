public class Carro {
    private String modelo;
    private String motor;
    private String cor;

    // Construtor privado
    private Carro() {}

    public static class Builder {
        private Carro carro;

        public Builder() {
            carro = new Carro();
        }

        public Builder setModelo(String modelo) {
            carro.modelo = modelo;
            return this;
        }

        public Builder setMotor(String motor) {
            carro.motor = motor;
            return this;
        }

        public Builder setCor(String cor) {
            carro.cor = cor;
            return this;
        }

        public Carro build() {
            return carro;
        }
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", motor=" + motor + ", cor=" + cor + "]";
    }
}