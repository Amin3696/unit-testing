package com.unitTestimng.unittesting.busines.stub;

import com.unitTestimng.unittesting.busines.SomeBusinessImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessStubTest {

    @Test
    public void calculateSumUsingDataService_basic() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStub());
        int actualResult = business.calculateSumUsingDataService();
        int expectResult = 6;
        assertEquals(expectResult, actualResult);
    }

    @Test
    public void calculateSum_empty() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStubEmpty());
        int actualResult = business.calculateSumUsingDataService();
        int expectResult = 0;
        assertEquals(expectResult, actualResult);
    }

    @Test
    public void calculateSum_one() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStubOneValue());
        int actualResult = business.calculateSumUsingDataService();
        int expectResult = 1;
        assertEquals(expectResult, actualResult);
    }

}
