public class Airline {
    private String title;
    private Flight[] flight;
    private int size = 0;
    public Airline(String title){
        this.title = title;
    }
    /**
     * Constructs each variable in Airline, and gorws the flight array
     * @param flightNum
     * @param from
     * @param to
     * @param duration
     * @param transfers
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        Flight flightNew = new Flight(flightNum, from, to, duration, transfers);
        this.flight = this.growArray(flightNew);
    }
    /**
     * Gets the title
     * @return title
     */
    public String getTitle(){
        return this.title;
    }
    /**
     * 
     * @param flights
     * @return grown array
     */
    private Flight[] growArray(Flight flights){ // add a flight to the array
        if (size == 0) {
            Flight[] temp = {flights};
            size++;
            return temp;
        }
        Flight[] tempArray = new Flight[size+1];
        for (int i = 0; i < size; i++) {
            tempArray[i] = flight[i];
        } // copied array
        tempArray[size] = flights;
        size++;
        return tempArray;
    }
    /**
     * Creates a Flight Iterator
     * @return Flight Iterator
     */
    public FlightIterator createIterator(){ 
        return new FlightIterator(flight);
    }
}
