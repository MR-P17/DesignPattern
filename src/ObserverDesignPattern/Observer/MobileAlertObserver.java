package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockAlertObservable;

public class MobileAlertObserver implements StockObserver{
    StockAlertObservable observable;
    String userId;

    public MobileAlertObserver(StockAlertObservable observable, String userId) {
        this.observable = observable;
        this.userId = userId;
    }

    @Override
    public void update() {
        sendMobileAlert(this.userId);
    }

    public void sendMobileAlert(String userId){
        System.out.println("Mobile alert send to "+ userId);
    }
}
