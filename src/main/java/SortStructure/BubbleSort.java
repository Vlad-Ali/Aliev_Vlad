package SortStructure;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort implements SortStrategy {
    private final int MAX_SIZE = 5_000;

    @Override
    public List<Integer> Sort(List<Integer> arrayList) {
        if (arrayList == null) {
            throw new NullPointerException("Can't sort , because List is null");
        }
        if (arrayList.size() > MAX_SIZE) {
            throw new IllegalStateException("List size " + arrayList.size() + " is too large");
        }
        List<Integer> arrayList1 = new ArrayList<>(List.copyOf(arrayList));
        for (int i = 0; i < arrayList1.size(); i++) {
            for (int j = i + 1; j < arrayList1.size(); j++) {
                if (arrayList1.get(i).compareTo(arrayList1.get(j)) > 0) {
                    Integer temp = arrayList1.get(i);
                    arrayList1.set(i, arrayList1.get(j));
                    arrayList1.set(j, temp);
                }
            }
        }
        return arrayList1;
    }
}
