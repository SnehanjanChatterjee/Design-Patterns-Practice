package behavioral.observer.ConceptAndCoding.ObserverDesignPattern;

import behavioral.observer.ConceptAndCoding.ObserverDesignPattern.Observable.IphoneObservableImpl;
import behavioral.observer.ConceptAndCoding.ObserverDesignPattern.Observable.StockObservable;
import behavioral.observer.ConceptAndCoding.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import behavioral.observer.ConceptAndCoding.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import behavioral.observer.ConceptAndCoding.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {

        StockObservable iphoneStockObservable=new IphoneObservableImpl();

        NotificationAlertObserver observer1=new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2=new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3=new MobileAlertObserverImpl("abc_username", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
