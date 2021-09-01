package observer;

import java.util.ArrayList;


public class Customer extends BestSellers{
    // BestSellers already implements Subject
    private Subject subject;
    private String firstName;
    private String lastName; 
    private ArrayList<Book> wishList;

    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void update(Book book) {
        // ALL best sellers go in here, no deletions
    }
    public void display() {
        // show full arraylist
    }
}
