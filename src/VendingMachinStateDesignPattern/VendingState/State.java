package VendingMachinStateDesignPattern.VendingState;

import VendingMachinStateDesignPattern.VendingMachine;

import java.util.List;

public interface State {
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception;
    public void insertCoins(VendingMachine vendingMachine, Coin coin) throws  Exception;
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception;
    public int getChange(int changeMoney) throws Exception;
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception;
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;
}
