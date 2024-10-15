package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListCopyTest {
    @Test
    void listcopyTest() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 0);
        assertEquals(list, new ListCopy().listcopy(list));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionIfArrayListIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new ListCopy().listcopy(null));
    }
}