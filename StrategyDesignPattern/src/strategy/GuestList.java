package strategy;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Sets up all necessary values to be searched with,
 * alongside which search to use
 */
public class GuestList {
    private String title;
    private ArrayList<String> people;
    private SearchBehavior searchBehavior;

    public GuestList(String title) {
        this.title = title;
        people = new ArrayList<String>();
        searchBehavior = new LinearSearch();
    }
    /**
     * Attempts to add the guest to the guest list
     * 
     * @param guest The name to add to the list
     */
    public boolean add(String person) {
        String persony = person.toLowerCase();
        if (searchBehavior.contains(people, persony)) {
            return false;
        }
        people.add(person);
        return true;
    }
    /**
     * Attempts to remove the guest from the list
     * 
     * @param guest the name to remove from the list
     */
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