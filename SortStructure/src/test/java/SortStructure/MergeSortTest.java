package SortStructure;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    @Test
    void shouldThrowNullPointerExceptionIfArrayListIsNull() {
        assertThrows(NullPointerException.class, () -> new MergeSort().Sort(null));
    }

    @Test
    void shouldThrowIllegalStateExceptionIfArrayListSizeIsLarge() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1_0000_000 + 1; i++) {
            arrayList.add(0);
        }
        assertThrows(IllegalStateException.class, () -> new MergeSort().Sort(arrayList));
    }

    @Test
    void SortTest() {
        List<Integer> arrayList = new ArrayList<>(List.of(-2, 1, 2, 100, 1, -10, 2, 10, 2, 1000, 2, -1000, 2, 2));
        assertEquals(List.of(-1000, -10, -2, 1, 1, 2, 2, 2, 2, 2, 2, 10, 100, 1000), new MergeSort().Sort(arrayList));
    }
}