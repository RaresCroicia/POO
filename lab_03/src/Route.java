public class Route {
    String origin;
    String destination;

    public Route(String origin, String destination){
        this.origin = origin;
        this.destination = destination;
    }

    public boolean isRetur(Route other){
        if(this.origin.equals(other.destination) && this.destination.equals(other.origin))
            return true;
        return false;
    }



}
