package com.unitTestimng.unittesting.busines;

import com.unitTestimng.unittesting.data.SomeDataService;

public class SomeBusinessImpl {

    private SomeDataService someDataService;//connecting to data layer

    public void setSomeDataService(SomeDataService someDataService) {//connecting to data layer
        this.someDataService = someDataService;
    }

    public int calculateSum(int[] data) { //this method is basic, in real world we get data not from arg but from databases data layer
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum;
    }

    public int calculateSumUsingDataService() {// the business layer will connect to the data layer and make the logic on the retrieved data
        int sum = 0;
        int[] data = someDataService.retrieveAllData();
        for (int value : data) {
            sum += value;
        }
        return sum;
    }
}
