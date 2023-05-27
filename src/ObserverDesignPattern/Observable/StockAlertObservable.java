package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.StockObserver;

public interface StockAlertObservable {
    public void add(StockObserver obj);

    public void remove(StockObserver obj);

    public void notifySubscribers();

    public void setData(int data);

    public int getData();
}
