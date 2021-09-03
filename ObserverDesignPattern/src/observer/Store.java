package observer;

import java.util.ArrayList;

public class Store implements Observer{
    private Subject subject;
    private String title;
    private ArrayList<Book> bestSellers; // top 5
    /**
     * Special Constructor:
     * Used specifically for the initial observer assignment (no title)
     * @param subject
     */
    public Store(Subject subject) {
        this.subject = subject;
        bestSellers = new ArrayList<>();
        subject.registerObserver(this);
    }
    /**
     * Normal Constructor
     * @param subject
     * @param title
     */
    public Store(Subject subject, String title) {
        this.subject = subject;
        this.title = title;
        bestSellers = new ArrayList<>();
    }
    /**
     * Updates bestseller queue.
     * If # of books is 5, deletes the oldest one
     * Adds book to list
     * @param book
     */
    public void update(Book book){
        if ((bestSellers.size())<5) {
            bestSellers.add(book);
        } else {
            bestSellers.remove(0);
            bestSellers.add(book);
        }
    }
    /**
     * Shows the current top 5 bestsellers
     */
    public void display() {
        System.out.println("Top 5 Best Sellers:");
        for(Book top5 : bestSellers) {
            System.out.println(top5.toString());
        }
        System.out.println("");
    }
}
