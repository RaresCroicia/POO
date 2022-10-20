public class Schedule {
    ClockTime departure;
    ClockTime arrival;

    Schedule(ClockTime departure, ClockTime arrival){
        this.departure = departure;
        this.arrival = arrival;
    }

    public int getDuration(){
        int minuteDep = departure.hour*60 + departure.minute;
        int minuteArr = arrival.hour*60 + arrival.minute;
        int diff = minuteArr - minuteDep;
        return diff;
    }



}
