public class Schedule {
    ClockTime departure;
    ClockTime arrival;

    public int getDuration(){
        int minuteDep = departure.hour*60 + departure.minute;
        int minuteArr = arrival.hour*60 + arrival.minute;
        int diff = minuteArr - minuteDep;
        return diff;
    }



}
