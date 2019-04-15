package com.gildedrose;

public class TestUtil {

    public static Item[] getTestItems() {
        return new Item[]{
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("+5 Dexterity Vest", 3, 20),
                new Item("+5 Dexterity Vest", 0, 20),
                new Item("Aged Brie", 2, 0),
                new Item("Aged Brie", 0, 0),
                new Item("Aged Brie", -1, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 0, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", -1, 49),
                new Item("Conjured Mana Cake", 3, 6),
                new Item("Conjured Mana Cake", 1, 6),
                new Item("Conjured Mana Cake", 0, 6)
        };
    }

    public static Item[] getControlItems() {
        return new Item[]{
                new Item("+5 Dexterity Vest", 9, 19),
                new Item("+5 Dexterity Vest", 2, 19),
                new Item("+5 Dexterity Vest", -1, 18),
                new Item("Aged Brie", 1, 1),
                new Item("Aged Brie", -1, 1),
                new Item("Aged Brie", -2, 1),
                new Item("Elixir of the Mongoose", 4, 6),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21),
                new Item("Backstage passes to a TAFKAL80ETC concert", 9, 22),
                new Item("Backstage passes to a TAFKAL80ETC concert", 4, 23),
                new Item("Backstage passes to a TAFKAL80ETC concert", 9, 50),
                new Item("Backstage passes to a TAFKAL80ETC concert", 4, 50),
                new Item("Backstage passes to a TAFKAL80ETC concert", -1, 0),
                new Item("Backstage passes to a TAFKAL80ETC concert", -2, 0),
                new Item("Conjured Mana Cake", 2, 4),
                new Item("Conjured Mana Cake", 0, 4),
                new Item("Conjured Mana Cake", -1, 2)
        };
    }
}
