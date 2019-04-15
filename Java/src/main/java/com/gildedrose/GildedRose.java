package com.gildedrose;

import static com.gildedrose.ItemConstants.ITEM_PREFIX_AGED_BRIE;
import static com.gildedrose.ItemConstants.ITEM_PREFIX_BACKSTAGE_PASSES;
import static com.gildedrose.ItemConstants.ITEM_PREFIX_CONJURED;
import static com.gildedrose.ItemConstants.ITEM_PREFIX_SULFURAS;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;

class GildedRose {

    private static final Consumer<Item> sellInUpdater = item -> item.sellIn -= (item.name.startsWith(ITEM_PREFIX_SULFURAS) ? 0 : 1);

    private static final Consumer<Item> qualityUpdater = item -> {
        if (item.name.startsWith(ITEM_PREFIX_CONJURED)) {
            item.quality -= (item.sellIn < 0 ? 4 : 2);
        } else if (item.name.startsWith(ITEM_PREFIX_AGED_BRIE)) {
            item.quality++;
        } else if (item.name.startsWith(ITEM_PREFIX_BACKSTAGE_PASSES)) {
            item.quality = (item.sellIn < 0 ? 0 : (item.quality + 1 + Math.min(10 / item.sellIn, 2)));
        } else if (!item.name.startsWith(ITEM_PREFIX_SULFURAS)) {
            item.quality -= (item.sellIn < 0 ? 2 : 1);
        }
    };

    private static final Consumer<Item> maxQualityLimiter = item -> item.quality = Math.min(item.quality, item.name.startsWith(ITEM_PREFIX_SULFURAS) ? 80 : 50);

    private static final Consumer<Item> minQualityLimiter = item -> item.quality = Math.max(0, item.quality);

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        if (items != null) {
            Stream.of(items)
                    .filter(Objects::nonNull)
                    .filter(item -> item.name != null)
                    .forEach(item -> {
                        sellInUpdater.accept(item);
                        qualityUpdater.accept(item);
                        minQualityLimiter.accept(item);
                        maxQualityLimiter.accept(item);
                    });
        }
    }
}