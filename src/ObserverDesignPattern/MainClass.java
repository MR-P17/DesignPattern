package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneUsersObservable;
import ObserverDesignPattern.Observable.StockAlertObservable;
import ObserverDesignPattern.Observer.EmailAlertObserver;
import ObserverDesignPattern.Observer.MobileAlertObserver;
import ObserverDesignPattern.Observer.StockObserver;

public class MainClass {
    public static void main(String[] args) {
        StockAlertObservable iphoneUsersObservable = new IphoneUsersObservable();
        StockObserver observer1 = new EmailAlertObserver(iphoneUsersObservable, "prashant.sin@gmail.com");
        StockObserver observer2 = new EmailAlertObserver(iphoneUsersObservable, "jatin.w@gmail.com");
        StockObserver observer3 = new MobileAlertObserver(iphoneUsersObservable, "prashant_123");

        iphoneUsersObservable.add(observer1);
        iphoneUsersObservable.add(observer2);
        iphoneUsersObservable.add(observer3);

        iphoneUsersObservable.setData(7);
        iphoneUsersObservable.setData(0);
        iphoneUsersObservable.setData(17);
    }





}
