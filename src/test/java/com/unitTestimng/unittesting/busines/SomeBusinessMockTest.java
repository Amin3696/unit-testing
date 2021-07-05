package com.unitTestimng.unittesting.busines;


import com.unitTestimng.unittesting.data.SomeDataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {

    SomeBusinessImpl business = new SomeBusinessImpl();   //best practice is to avoid repeat ourself because of that line 17 and 18 and using @Before method
    SomeDataService dataServiceMock = mock(SomeDataService.class);

    @BeforeEach
    public void before() {
        business.setSomeDataService(dataServiceMock);
    }

    @Test
    public void calculateSumUsingDataService_basic() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1, 2, 3});
        int actualResult = business.calculateSumUsingDataService();
        int expectResult = 6;
        assertEquals(expectResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_empty() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        int actualResult = business.calculateSumUsingDataService();
        int expectResult = 0;
        assertEquals(expectResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_one() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1});
        int actualResult = business.calculateSumUsingDataService();
        int expectResult = 1;
        assertEquals(expectResult, actualResult);
    }
}
