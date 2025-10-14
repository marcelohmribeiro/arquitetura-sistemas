import java.util.Collections;
import java.util.List;

public class QuickSortStrategy extends SortStrategy {

    @Override
    public void sort(List<Integer> list) {
        if (list == null || list.size() < 2) return;
        quicksort(list, 0, list.size() - 1);
        System.out.println("Ordenação QuickSort");
    }

    private void quicksort(List<Integer> a, int lo, int hi) {
        if (lo >= hi) return;
        int p = partition(a, lo, hi);
        quicksort(a, lo, p - 1);
        quicksort(a, p + 1, hi);
    }

    private int partition(List<Integer> a, int lo, int hi) {
        int pivot = a.get(hi);
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (a.get(j) <= pivot) {
                Collections.swap(a, i, j);
                i++;
            }
        }
        Collections.swap(a, i, hi);
        return i;
    }
}
