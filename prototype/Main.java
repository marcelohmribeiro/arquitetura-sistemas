public class Main {
    public static void main(String[] args) {
        Documento doc1 = new Documento("Relatório", "Conteúdo base...");
        Documento doc2 = doc1.clone();
        doc2.setTitulo("Relatório Editado");

        System.out.println(doc1);
        System.out.println(doc2);
    }
}
