
package strategy;

import java.util.ArrayList;

/**
 * Interface forces all searches to include "contains"
 */
public interface SearchBehavior {
    public boolean contains(ArrayList<String> data, String item);
}
