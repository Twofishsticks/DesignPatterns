import java.util.Iterator;



public class FlightIterator implements Iterator{
    private Flight[] flights;
    private int position; // auto zero

    FlightIterator(Flight[] flights){
        this.flights = flights;
    }
    
    @Override
    public boolean hasNext() {
        if(position >= flights.length || flights[position] == null) {
			return false;
		} else {
			return true;
		}
    }

    @Override
    public Object next() {
        Flight nextFlight = flights[position];
		position = position + 1;
		return nextFlight;
    }
    
}

//