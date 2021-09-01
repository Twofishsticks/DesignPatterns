package observer;

import java.util.Queue;

public class Store extends BestSellers{
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers; // top 5
    public Store(Subject subject, String title) {
        this.subject = subject;
        this.title = title;
    }
    public void update(Book book){
        // move until 5 books, then make room by deleting oldest book
    }
    public void display() {
        // show the top 5
    }
}
