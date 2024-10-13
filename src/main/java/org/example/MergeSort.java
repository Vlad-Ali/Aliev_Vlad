package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import static java.util.List.*;

public class MergeSort implements SortStrategy {
    private final int MAX_SIZE = 1_0000_000;

    @Override
    public List<Integer> Sort(List<Integer> arrayList) {
        if (arrayList == null) {
            throw new NullPointerException("Can't sort , because List is null");
        }
        if (arrayList.size() > MAX_SIZE) {
            throw new IllegalStateException("List size " + arrayList.size() + " is too large");
        }
        List<Integer> arrayList1 = new ArrayList<>(copyOf(arrayList));
        Collections.sort(arrayList1);
        return arrayList1;
    }

    @Override
    public SortType type() {
        return SortType.MERGESORT;
    }
}
