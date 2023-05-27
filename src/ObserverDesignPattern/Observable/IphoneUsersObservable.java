package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneUsersObservable implements StockAlertObservable{
    public List<StockObserver> objList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(StockObserver obj){
        objList.add(obj);
    }

    @Override
    public void remove(StockObserver obj){
        objList.remove(obj);
    }

    @Override
    public void notifySubscribers(){
        for(StockObserver observer : objList){
            observer.update();
        }
    }

    @Override
    public void setData(int stockCount){
        if(this.stockCount == 0){
            notifySubscribers();
        }
        this.stockCount = stockCount;
    }

    @Override
    public int getData(){
        return this.stockCount;
    }

}
