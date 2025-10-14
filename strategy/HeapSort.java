import java.util.Collections;
import java.util.List;

public class HeapSort extends SortStrategy {

    @Override
    public void sort(List<Integer> list) {
        if (list == null || list.size() < 2) return;

        int n = list.size();

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }

        for (int end = n - 1; end > 0; end--) {
            Collections.swap(list, 0, end);
            heapify(list, end, 0);
        }

        System.out.println("Ordenação HeapSort");
    }

    private void heapify(List<Integer> a, int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < heapSize && a.get(left) > a.get(largest)) largest = left;
        if (right < heapSize && a.get(right) > a.get(largest)) largest = right;

        if (largest != i) {
            Collections.swap(a, i, largest);
            heapify(a, heapSize, largest);
        }
    }
}
