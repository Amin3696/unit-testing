package com.unitTestimng.unittesting.busines;

import com.fasterxml.jackson.databind.node.POJONode;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import javax.servlet.http.PushBuilder;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class ListMockTest {
    List<String> mock = mock(List.class);

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

    @Test
    public void verificationBasics() {
        //SUT
        String value = mock.get(0);
        String value1 = mock.get(1);
        String value2 = mock.get(2);
        //verify
        verify(mock).get(0);
        verify(mock).get(1);
        verify(mock).get(2);
        verify(mock, times(3)).get(anyInt());
        verify(mock, atLeast(2)).get(anyInt());
        verify(mock, atLeastOnce()).get(anyInt());
        verify(mock, atMost(3)).get(anyInt());
        verify(mock, never()).get(3);
    }

    @Test
    public void argumentCapturing() {
        //SUT
        mock.add("SomeString");

        //Verification
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock).add(captor.capture());

        assertEquals("SomeString", captor.getValue());
    }
}
