package com.unitTestimng.unittesting.busines;

import com.unitTestimng.unittesting.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemBusinessService {

    public Item retreiveHardcodedItem() {
        return new Item(55, "umbrella", 10, 5);
    }
}
