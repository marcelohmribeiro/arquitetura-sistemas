public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro.Builder()
                .setModelo("Fusca Turbo")
                .setMotor("1.6")
                .setCor("Vermelho")
                .build();

        System.out.println(carro);
    }
}