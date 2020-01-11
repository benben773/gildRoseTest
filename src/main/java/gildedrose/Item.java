package gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;


    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void passOneDay() {
        if (name.equals("Aged Brie")) {
            if (quality < 50) {
                quality = quality + 1;
            }

            sellIn = sellIn - 1;

            if (sellIn < 0) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        } else if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (quality < 50) {
                quality = quality + 1;

                if (sellIn < 11) {
                    if (quality < 50) {
                        quality = quality + 1;
                    }
                }

                if (sellIn < 6) {
                    if (quality < 50) {
                        quality = quality + 1;
                    }
                }
            }
            sellIn = sellIn - 1;

            if (sellIn < 0) {
                quality = quality - quality;
            }
        } else if (name.equals("Sulfuras, Hand of Ragnaros")) {

        } else {
            if (quality > 0) {
                quality = quality - 1;
            }

            sellIn = sellIn - 1;

            if (sellIn < 0) {
                if (quality > 0) {
                    quality = quality - 1;
                }
            }
        }
    }


}
