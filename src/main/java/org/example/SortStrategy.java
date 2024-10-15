package org.example;

import java.util.List;

public interface SortStrategy {
    List<Integer> Sort(List<Integer> arrayList);
    SortType type();
}
