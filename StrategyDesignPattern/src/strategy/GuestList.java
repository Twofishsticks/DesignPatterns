// This is the place where everything comes together in the arraylist
package strategy;

import java.util.ArrayList;
import java.util.Collections;

public class GuestList {
    private String title;
    private ArrayList<String> people;
    private SearchBehavior searchBehavior;

    public GuestList(String title) {
        this.title = title;
        people = new ArrayList<String>();
        searchBehavior = new LinearSearch();
    }
    public boolean add(String person) {
        String persony = person.toLowerCase();
        if (searchBehavior.contains(people, persony)) {
            return false;
        }
        people.add(person);
        return true;
    }
    public boolean remove(String person) {
        String persony = person.toLowerCase();
        if (!searchBehavior.contains(people, persony)) {
            return false;
        }
        people.remove(person);
        return true;
    }
    public String getTitle() {
        return this.title;
    }
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }
    public ArrayList<String> getList() {
        Collections.sort(people);
        return this.people;
    }
}