package com.gildedrose;

import static com.gildedrose.TestUtil.getControlItems;
import static com.gildedrose.TestUtil.getTestItems;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = getTestItems();
        Item[] controlItems = getControlItems();
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        for (int i = 0; i < items.length; i++) {
            assertEquals(controlItems[i].name, items[i].name);
            assertEquals(controlItems[i].sellIn, items[i].sellIn);
            assertEquals(controlItems[i].quality, items[i].quality);
        }
    }
}
