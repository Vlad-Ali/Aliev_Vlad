package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class SortStructureTest {
    @Test
    void BubbleSortshouldThrowIllegalArgumentExceptionIfArrayListIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new SortStructure(List.of(new BubbleSort())).sort(null, new BubbleSort()));
    }

    @Test
    void NoBubbleSortshouldThrowNoSuchElementException() {
        List<Integer> arr = List.of(1, 2);
        assertThrows(NoSuchElementException.class, () -> new SortStructure(List.of(new MergeSort())).sort(arr, new BubbleSort()));
    }

    @Test
    void BubbleSortshouldThrowIllegalStateExceptionIfArrayListSizeIsLarge() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(0);
        }
        assertThrows(IllegalStateException.class, () -> new SortStructure(List.of(new BubbleSort())).sort(arrayList, new BubbleSort()));
    }

    @Test
    void BubbleSortTest() {
        List<Integer> arrayList = new ArrayList<>(List.of(-2, 1, 2, 100, 1, -10, 2, 10, 2, 1000, 2, -1000, 2, 2));
        assertEquals(List.of(-1000, -10, -2, 1, 1, 2, 2, 2, 2, 2, 2, 10, 100, 1000), new SortStructure(List.of(new BubbleSort(), new MergeSort())).sort(arrayList, new BubbleSort()));
    }

    @Test
    void MergeSortshouldThrowIllegalArgumentExceptionIfArrayListIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new SortStructure(List.of(new BubbleSort(), new MergeSort())).sort(null, new MergeSort()));
    }

    @Test
    void NoMergeSortshouldThrowNoSuchElementException() {
        List<Integer> arr = List.of(1, 2);
        assertThrows(NoSuchElementException.class, () -> new SortStructure(List.of(new BubbleSort())).sort(arr, new MergeSort()));
    }

    @Test
    void MergeSortshouldThrowIllegalStateExceptionIfArrayListSizeIsLarge() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1_000_0000 + 2; i++) {
            arrayList.add(0);
        }
        assertThrows(IllegalStateException.class, () -> new SortStructure(List.of(new BubbleSort(), new MergeSort())).sort(arrayList, new MergeSort()));
    }

    @Test
    void MergeSortTest() {
        List<Integer> arrayList = new ArrayList<>(List.of(-2, 1, 2, 100, 1, -10, 2, 10, 2, 1000, 2, -1000, 2, 2));
        assertEquals(List.of(-1000, -10, -2, 1, 1, 2, 2, 2, 2, 2, 2, 10, 100, 1000), new SortStructure(List.of(new MergeSort())).sort(arrayList, new MergeSort()));
    }
}