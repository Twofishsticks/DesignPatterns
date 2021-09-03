package observer;

import java.util.ArrayList;

public class BestSellers implements Subject{
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;
    public BestSellers() {
        this.observers = new ArrayList<>();
        this.bestSellers = new ArrayList<>();
    }
    /**
     * add lil dude
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    /**
     * rem lil dude
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    /**
     * notify
     * @param book
     */
    @Override
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }
    /**
     * take in, notify
     * @param book
     */
    public void addBook(Book book) {
        bestSellers.add(book);
        this.notifyObservers(book);
    }
    
    
}
