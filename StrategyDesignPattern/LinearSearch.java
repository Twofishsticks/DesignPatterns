
package strategy;
public class LinearSearch implements SearchBehavior {
    public LinearSearch() {
        // empty
    }
    public boolean contains(ArrayList<String> data, String item) {
        // linear is when it goes 0-last, checking every one
        int lastindex = data.length()-1;
        int iterator = 0;
        while (iterator < lastindex) {
            if (data[iterator].equals(item)) {
                return true;
            }
            iterator++;
        }
        return false;
    }
}
