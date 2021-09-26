public class Flight {
    private String flightNum;
    private String from;
    private String to; 
    private int duration; // in mins
    private int transfers;
    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }
    public String toString() {
        String everyString = "";
        everyString+= "\n Flight Number: "+ this.getFlightNum();
        everyString+= "\n From: "+ this.getFrom();
        everyString+= "\n To: "+ this.getTo();
        int hours = duration/60;
        int mins = (hours+1)*60 - duration;
        everyString+= "\n Duration: "+ hours+ " hours " +mins+ " minutes";
        if (transfers == 0) {
        everyString+= "\n Direct Flight \n";
        } else {
        everyString+= "\n " + this.getTransfers() + " Transfers \n";
        }
        return everyString;
        // put something in here obviously
    }
    public String getFrom(){
        return this.from;
    }
    public String getTo() {
        return this.to;
    }
    public String getFlightNum() {
        return this.flightNum;
    }
    public int getDuration() {
        return this.duration;
    }
    public int getTransfers() {
        return this.transfers;
    }
}
