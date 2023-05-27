package VendingMachinStateDesignPattern.VendingState;

import VendingMachinStateDesignPattern.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{

    public IdleState(){
        System.out.println("Currently vending machine in idle state");
    }

    public IdleState(VendingMachine vendingMachine){
        System.out.println("Currently vending machine in idle state");
        vendingMachine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new HasMoneyState());
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
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        return null;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        return null;
    }
}
