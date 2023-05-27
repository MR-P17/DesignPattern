package VendingMachinStateDesignPattern;

import VendingMachinStateDesignPattern.VendingState.Coin;
import VendingMachinStateDesignPattern.VendingState.IdleState;
import VendingMachinStateDesignPattern.VendingState.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    State vendingMachineState;
    List<Coin> coinList;
    ItemInventory inventory;

    public VendingMachine() {
        this.vendingMachineState = new IdleState();
        this.inventory = new ItemInventory(10);
        this.coinList = new ArrayList<>();
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(Coin coin) {
        this.coinList.add(coin);
    }

    public void setCoinList(List<Coin> coins) {
        this.coinList = coins;
    }

    public ItemInventory getInventory() {
        return inventory;
    }

    public void setInventory(ItemInventory inventory) {
        this.inventory = inventory;
    }
}
