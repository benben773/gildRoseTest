package gildedrose;

import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void approveTest() {

        CombinationApprovals.verifyAllCombinations(
                this::getString,
                new String[]{"foo","Aged Brie","Sulfuras, Hand of Ragnaros","Backstage passes to a TAFKAL80ETC concert"},
                new Integer[]{-1,0,1,10,11,12},
                new Integer[]{-1,0,1,49,50,51}
        );
    }

    private String getString(String foo, int sellIn, int quality) {
        Item[] items = new Item[]{new Item(foo, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
    }

}
