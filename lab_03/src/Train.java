public class Train {
    Route r;
    Schedule s;
    boolean local;


    public Train(String origin, String destination, ClockTime departure, ClockTime arrival){
        r = new Route(origin, destination);
        s = new Schedule(departure, arrival);
    }

}
