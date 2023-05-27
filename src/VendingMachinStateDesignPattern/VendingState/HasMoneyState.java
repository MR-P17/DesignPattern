package VendingMachinStateDesignPattern.VendingState;

import VendingMachinStateDesignPattern.VendingMachine;

import java.util.List;

public class HasMoneyState implements State{
    public HasMoneyState(){
        System.out.println("Currently Vending machine is in HasMoneyState");
    }


    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoins(VendingMachine vendingMachine, Coin coin) throws Exception {
        System.out.println("Accept Coins..");
        vendingMachine.setCoinList(coin);
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {

    }

    @Override
    public int getChange(int changeMoney) throws Exception {
        return 0;
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
