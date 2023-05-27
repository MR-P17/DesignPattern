package VendingMachinStateDesignPattern.VendingState;

public class Item {
    ItemType itemType;
    int price;

    public Item(ItemType itemType, int price) {
        this.itemType = itemType;
        this.price = price;
    }

    public Item() {

    }

    public ItemType getItemType() {
        return itemType;
    }

    public int getPrice() {
        return price;
    }
}
