package observer;

import java.util.ArrayList;

public class BestSellers extends Book implements Subject{
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;
    // elp, try super(), calling to above thing (?)
    // maybe retry the extend/implements
    public BestSellers() {

    }
    /**
     * 
     * @param observer
     */
    public void registerObserver(Observer observer) {

    }
    /**
     * 
     * @param observer
     */
    public void removeObserver(Observer observer) {

    }
    /**
     * 
     * @param book
     */
    public void notifyObservers(Book book) {

    }
    /**
     * 
     * @param book
     */
    public void addBook(Book book) {

    }
    // observer is technically implemented, this is needed
    public void update(Book book) {
        
    }
}
