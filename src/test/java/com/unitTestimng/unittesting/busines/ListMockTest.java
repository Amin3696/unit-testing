package com.unitTestimng.unittesting.busines;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListMockTest {
    List mock = mock(List.class);

    @Test
    public void size_basic() {
        when(mock.size()).thenReturn(6);
        assertEquals(6, mock.size());
    }

    @Test
    public void returnDifferentValues() {
        when(mock.size()).thenReturn(6).thenReturn(11);
        assertEquals(6, mock.size());
        assertEquals(11, mock.size());
    }

    @Test
    public void returnWithParameters() {
        when(mock.get(0)).thenReturn("ASTv");
        assertEquals("ASTv", mock.get(0));
        assertEquals(null, mock.get(2));
    }

    @Test
    public void returnWithGenericParameters() {
        when(mock.get(anyInt())).thenReturn("ASTv");
        assertEquals("ASTv", mock.get(0));
        assertEquals("ASTv", mock.get(10));
    }


}
