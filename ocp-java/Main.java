public class Main {
    public static void main(String[] args) {
        Remuneravel contrato = new Contrato(5000f);
        Remuneravel estagio = new Estagio(1200f);
        Remuneravel clt = new CLT(4000f, 600f);

        Folha folha = new Folha();

        folha.calcular(contrato);
        System.out.println("Salário contrato: " + folha.getSaldo());

        folha.calcular(estagio);
        System.out.println("Bolsa estágio: " + folha.getSaldo());

        folha.calcular(clt);
        System.out.println("CLT: " + folha.getSaldo());
    }
}
