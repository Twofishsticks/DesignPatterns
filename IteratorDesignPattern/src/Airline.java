public class Airline {
    private String title;
    private Flight[] flight;
    private int size = 0;
    public Airline(String title){
        this.title = title;
    }
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        Flight flightNew = new Flight(flightNum, from, to, duration, transfers);
        this.flight = this.growArray(flightNew);
    }
    public String getTitle(){
        return this.title;
    }
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
    public FlightIterator createIterator(){ 
        return new FlightIterator(flight);
    }
}
