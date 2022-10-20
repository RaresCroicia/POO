public class ClockTime {
    int hour, minute;

    public int compare(ClockTime other){
        if(this.hour < other.hour)
            return -1;
        if(this.hour > other.hour)
            return 1;
        if(this.hour == other.hour && this.minute == other.minute)
            return 0;
        return this.minute < other.minute ? -1 : 1;
    }


}
