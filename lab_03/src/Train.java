public class Train {
    Route r;
    Schedule s;
    boolean local;


    public Train(String origin, String destination, ClockTime departure, ClockTime arrival, boolean local){
        this.local = local;
        r = new Route(origin, destination);
        s = new Schedule(departure, arrival);
    }

    public String toString(){
        String ans = "";
        ans += local;
        ans += " ";
        ans += r.origin;
        ans += " (";
        ans += s.departure.hour;
        ans += ":";
        if(s.departure.minute < 10)
            ans += "0";
        ans += s.departure.minute + ") ";
        ans += "-> ";
        ans += r.destination;
        ans += " (";
        ans += s.arrival.hour + ":";
        if(s.arrival.minute < 10)
            ans += "0";
        ans += s.arrival.minute + ")";
        return ans;
    }

}
