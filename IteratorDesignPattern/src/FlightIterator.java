import java.util.Iterator;



public class FlightIterator implements Iterator{
    private Flight[] flights;
    private int position; // auto zero
    /**
     * Creates an Iterator for flights
     * @param flights
     */
    FlightIterator(Flight[] flights){
        this.flights = flights;
    }
    /**
     * Checks if flights has another index with a Flight
     */
    @Override
    public boolean hasNext() {
        if(position >= flights.length || flights[position] == null) {
			return false;
		} else {
			return true;
		}
    }
    /**
     * Returns the next Flight in flights
     * @return next flight
     */
    @Override
    public Object next() {
        Flight nextFlight = flights[position];
		position = position + 1;
		return nextFlight;
    }
    
}

//