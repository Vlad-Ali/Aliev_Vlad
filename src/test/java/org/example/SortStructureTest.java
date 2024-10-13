package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortStructureTest {
    @Test
    void BubbleSortshouldThrowNullPointerExceptionIfArrayListIsNull() {
        assertThrows(NullPointerException.class, () -> new SortStructure().Sort(null, new BubbleSort()));
    }

    @Test
    void BubbleSortshouldThrowIllegalStateExceptionIfArrayListSizeIsLarge() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(0);
        }
        assertThrows(IllegalStateException.class, () -> new SortStructure().Sort(arrayList, new BubbleSort()));
    }

    @Test
    void BubbleSortTest() {
        List<Integer> arrayList = new ArrayList<>(List.of(-2, 1, 2, 100, 1, -10, 2, 10, 2, 1000, 2, -1000, 2, 2));
        assertEquals(List.of(-1000, -10, -2, 1, 1, 2, 2, 2, 2, 2, 2, 10, 100, 1000), new SortStructure().Sort(arrayList, new BubbleSort()));
    }

    @Test
    void MergeSortshouldThrowNullPointerExceptionIfArrayListIsNull() {
        assertThrows(NullPointerException.class, () -> new SortStructure().Sort(null, new MergeSort()));
    }

    @Test
    void MergeSortshouldThrowIllegalStateExceptionIfArrayListSizeIsLarge() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1_000_0000 + 2; i++) {
            arrayList.add(0);
        }
        assertThrows(IllegalStateException.class, () -> new SortStructure().Sort(arrayList, new MergeSort()));
    }

    @Test
    void MergeSortTest() {
        List<Integer> arrayList = new ArrayList<>(List.of(-2, 1, 2, 100, 1, -10, 2, 10, 2, 1000, 2, -1000, 2, 2));
        assertEquals(List.of(-1000, -10, -2, 1, 1, 2, 2, 2, 2, 2, 2, 10, 100, 1000), new SortStructure().Sort(arrayList, new MergeSort()));
    }
}