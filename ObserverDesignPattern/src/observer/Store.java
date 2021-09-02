package observer;

import java.util.PriorityQueue;
import java.util.Queue;

public class Store implements Observer{
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers; // top 5
    /**
     * Special Constructor:
     * Used specifically for the initial observer assignment (no title)
     * @param subject
     */
    public Store( Subject subject) {
        this.subject = subject;
        bestSellers = new PriorityQueue<>();
        // important
        subject.registerObserver(this);
        // register w the big boy
    }
    /**
     * Normal Constructor
     * @param subject
     * @param title
     */
    public Store(Subject subject, String title) {
        this.subject = subject;
        this.title = title;
        bestSellers = new PriorityQueue<>();
    }
    /**
     * Updates bestseller queue.
     * If # of books is 5, deletes the oldest one
     * Adds book to list
     * @param book
     */
    public void update(Book book){
        // move until 5 books, then make room by deleting oldest book
        if (bestSellers.size()<4) {
            bestSellers.add(book);
        } else {
            bestSellers.remove();
            bestSellers.add(book);
        }
    }
    /**
     * Shows the current top 5 bestsellers
     */
    public void display() {
        // show the top 5
        for(Book top5 : bestSellers) {
            System.out.println(top5.toString());
        }
    }
}
