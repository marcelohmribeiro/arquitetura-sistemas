import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> dados;

        MyList lista = new MyList();
        dados = new ArrayList<>(Arrays.asList(34, 2, 78, 1, 45, 12, 12, 90, 3));
        lista.sort(dados);
        System.out.println(dados);

        lista.setSortStrategy(new ShellSort());
        dados = new ArrayList<>(Arrays.asList(34, 2, 78, 1, 45, 12, 12, 90, 3));
        lista.sort(dados);
        System.out.println(dados);

        lista.setSortStrategy(new HeapSort());
        dados = new ArrayList<>(Arrays.asList(34, 2, 78, 1, 45, 12, 12, 90, 3));
        lista.sort(dados);
        System.out.println(dados);
    }
}
