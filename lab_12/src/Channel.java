import java.util.ArrayList;

public class Channel {
    public ArrayList<User> subscribers;
    public String name;

    public Channel(String name) {
        this.name = name;
        subscribers = new ArrayList<>();
    }

    void subscribe(User user){
        subscribers.add(user);
    }

    void unsubscribe(User user) {
        subscribers.remove(user);
    }

    void notify(String notification) {
        for(User subscriber : subscribers)
            subscriber.update(this, notification);
    }
}
