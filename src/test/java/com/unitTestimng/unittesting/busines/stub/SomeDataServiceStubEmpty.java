package com.unitTestimng.unittesting.busines.stub;

import com.unitTestimng.unittesting.data.SomeDataService;

public class SomeDataServiceStubEmpty implements SomeDataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{};
    }
}
