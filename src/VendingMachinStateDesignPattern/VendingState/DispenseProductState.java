package VendingMachinStateDesignPattern.VendingState;

import VendingMachinStateDesignPattern.VendingMachine;

import java.util.List;

public class DispenseProductState implements State{

    DispenseProductState(VendingMachine machine, int codeNumber) throws Exception{

        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(machine, codeNumber);
    }


    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void insertCoins(VendingMachine vendingMachine, Coin coin) throws Exception {

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {

    }

    @Override
    public int getChange(int changeMoney) throws Exception {
        return 0;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        return null;
    }
}
