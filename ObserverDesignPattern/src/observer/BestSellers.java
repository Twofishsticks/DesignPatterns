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
     * Registers an Observer
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    /**
     * Removes an Observer
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    /**
     * Notifies all Observers
     * @param book
     */
    @Override
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }
    /**
     * Takes in a book, then notifies all Observers
     * @param book
     */
    public void addBook(Book book) {
        bestSellers.add(book);
        this.notifyObservers(book);
    }
    

}
