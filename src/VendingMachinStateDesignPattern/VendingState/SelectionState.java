package VendingMachinStateDesignPattern.VendingState;

import VendingMachinStateDesignPattern.VendingMachine;

import java.util.List;

public class SelectionState implements State{

    public SelectionState(){
        System.out.println("Currently Vending machine is in SelectionState");
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
        Item item = vendingMachine.getInventory().getItem(codeNumber);
        int paidByUser = 0;
        for(Coin coin : vendingMachine.getCoinList()){
            paidByUser += coin.getValue();
        }

        if(paidByUser < item.getPrice()){
            refundFullMoney(vendingMachine);
            throw new  Exception("insufficient amount");
        }

        else if(paidByUser >= item.getPrice()){
            if(paidByUser > item.getPrice()){
                getChange(paidByUser-item.getPrice());
            }
            vendingMachine.setVendingMachineState(new DispenseProductState(vendingMachine, codeNumber));
        }


    }

    @Override
    public int getChange(int changeMoney) throws Exception {
        return changeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        return null;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Return full money.");
        vendingMachine.setVendingMachineState(new IdleState());
        return vendingMachine.getCoinList();
    }
}
