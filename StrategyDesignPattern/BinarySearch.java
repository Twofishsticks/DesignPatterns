
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
            
        }
        if (data.length()==1 && data.get(0).equals(String)) {
            return true;
        }
        return false;
    }
}
