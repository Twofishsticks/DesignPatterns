// This is the place where everything comes together in the arraylist
package strategy;
public class GuestList {
    private String title;
    private ArrayList<String> people;
    private searchBehavior SearchBehavior;

    public GuestList(String title) {
        this.title = title;
        ArrayList<String> people = new ArrayList<String>;
        searchBehavior = new LinearSearch;
    }
    public boolean add(String person) {
        if () {
            return false;
        }
        people.add(person);
        return true;
    }
    public boolean remove(String person) {
        if () {
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
        return this.people;
    }
}