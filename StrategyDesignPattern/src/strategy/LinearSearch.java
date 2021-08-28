
package strategy;

import java.util.ArrayList;

public class LinearSearch implements SearchBehavior {
    public LinearSearch() {
        // empty
    }
    public boolean contains(ArrayList<String> data, String item) {
        // linear is when it goes 0-last, checking every one
        int lastindex = data.size()-1;
        int iterator = 0;
        while (iterator < lastindex) {
            if ((data.get(iterator).toLowerCase()).equals(item)) {
                return true;
            }
            iterator++;
        }
        return false;
    }
}
