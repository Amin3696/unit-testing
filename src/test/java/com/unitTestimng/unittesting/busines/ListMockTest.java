package com.unitTestimng.unittesting.busines;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class ListMockTest {
    private static final Logger logger = LoggerFactory.getLogger(ListMockTest.class);
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

    @Test
    public void multipleArgumentCapturing() {
        //SUT
        mock.add("SomeString1");
        mock.add("SomeString2");
        mock.add("SomeString3");

        //Verification
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock, times(3)).add(captor.capture());

        List<String> allValues = captor.getAllValues();

        assertEquals("SomeString1", allValues.get(0));
        assertEquals("SomeString2", allValues.get(1));
        assertEquals(3, allValues.size());
    }

    @Test
    public void mocking() {
        ArrayList arrayListMock = mock(ArrayList.class);
        System.out.println(arrayListMock.get(0));//null
        System.out.println(arrayListMock.size());//0
        arrayListMock.add("Test");
        arrayListMock.add("Test2");
        System.out.println(arrayListMock.size());//0
        when(arrayListMock.size()).thenReturn(5);
        System.out.println(arrayListMock.size());//5
        //a mock does not retain behavior of the original class.
    }

    @Test
    public void spying() {
        ArrayList arrayListSpy = spy(ArrayList.class);
        arrayListSpy.add("Test0");
        logger.info(String.valueOf(arrayListSpy.get(0)));//Test0
        logger.info(String.valueOf(arrayListSpy.size()));//1
        arrayListSpy.add("Test");
        arrayListSpy.add("Test2");
        logger.info(String.valueOf(arrayListSpy.size()));//3

        when(arrayListSpy.size()).thenReturn(5);
        logger.info(String.valueOf(arrayListSpy.size()));//5

        arrayListSpy.add("Test4");
        verify(arrayListSpy).add("Test4");

        logger.info(String.valueOf(arrayListSpy.size()));//5

        //a spy, by default retains behavior of the original class.
        //it is possible to stub (override) and verify specific behavior (methods) on a spy!
    }
}
