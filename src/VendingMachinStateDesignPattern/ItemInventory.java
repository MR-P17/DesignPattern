package VendingMachinStateDesignPattern;

import VendingMachinStateDesignPattern.VendingState.Item;

public class ItemInventory {
    ItemShelf [] inventory;

    public ItemInventory(int size) {
        this.inventory = new ItemShelf[size];
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public void initialEmptyInventory(){

    }

    public void addItem(Item item, int codeNumber){

    }

    public Item getItem(int codeNumber){
        return new Item();
    }

    public void updateSoldOutItem(int codeNumber){

    }
}
