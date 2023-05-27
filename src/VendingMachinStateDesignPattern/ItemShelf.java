package VendingMachinStateDesignPattern;

import VendingMachinStateDesignPattern.VendingState.Item;

public class ItemShelf {
    Item item;
    int code;
    boolean isSoldOut;

    public ItemShelf(Item item, int code, boolean isSoldOut) {
        this.item = item;
        this.code = code;
        this.isSoldOut = isSoldOut;
    }

    public Item getItem() {
        return item;
    }

    public int getCode() {
        return code;
    }

    public boolean isSoldOut() {
        return isSoldOut;
    }
}
