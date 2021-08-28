
package strategy;

import java.util.ArrayList;

public class BinarySearch implements SearchBehavior {
    public BinarySearch() {
        // empty
    }
    public boolean contains(ArrayList<String> data, String item) {
        data.sort();
        // binary is when it goes half and half, then half, etc. 
        if (data.length()>1) {
            int halvsies = data.length()/2;
            // fix compareto for a string
            if (data.get(halvsies).compareTo(item) == 1) {
                // current item > item
                ArrayList<String> halver = data.subList(0, halvsies-1);
                this.contains(halver, item);
            }
            if (data.get(halvsies).compareTo(item) == -1) {
                // current item < item
                ArrayList<String> halver = data.subList(halvsies+1, data.length()-1);
                this.contains(halver, item);
            }
        }
        if (data.length()==1 && data.get(0).equals(String)) {
            return true;
        }
        return false;
    }
}
