package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockAlertObservable;

public class EmailAlertObserver implements StockObserver{
    StockAlertObservable observable;
    String emailId;

    public EmailAlertObserver(StockAlertObservable observable, String emailId) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMail(this.emailId);
    }

    public void sendMail(String emailId){
        System.out.println("Alert Mail send to " + emailId);
    }
}
