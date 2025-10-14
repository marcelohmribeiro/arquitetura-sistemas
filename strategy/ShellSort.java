import java.util.List;

public class ShellSort extends SortStrategy {

    @Override
    public void sort(List<Integer> list) {
        if (list == null || list.size() < 2) return;

        int n = list.size();
        int gap = n / 2;

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                int temp = list.get(i);
                int j = i;
                while (j >= gap && list.get(j - gap) > temp) {
                    list.set(j, list.get(j - gap));
                    j -= gap;
                }
                list.set(j, temp);
            }
            gap /= 2;
        }
        System.out.println("Ordenação ShellSort");
    }
}
