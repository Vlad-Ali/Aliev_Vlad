package SortStructure;

import java.util.List;

public class SortStructure {
    public List<Integer> Sort(List<Integer> arrayList, SortStrategy sortStrategy) {
        try {
            return sortStrategy.Sort(arrayList);
        } catch (NullPointerException e) {
            throw e;
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
