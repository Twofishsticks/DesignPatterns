
package strategy;

import java.util.ArrayList;

public class BinarySearch implements SearchBehavior {
    public BinarySearch() {
        // empty
    }
    public boolean contains(ArrayList<String> data, String item) { 
        int left = 0;
        int right = data.size() - 1; 
        while (left <= right)
        { 
            int mid = left + (right - left) / 2; 
    
            // Check if item is there 
            if ((data.get(mid).toLowerCase()).equals(item)) 
                return true; 
    
            // If item is bigger, go right
            if ((data.get(mid).toLowerCase()).compareTo(item) == 1) {
                left = mid + 1; 
            }
            // If item is smaller, go left
            else
                right = mid - 1; 
        }
        return false; 
    }

}

// I looked at https://www.geeksforgeeks.org/java-program-to-perform-binary-search-on-arraylist/ 
// for the base of the array.
