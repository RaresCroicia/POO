public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }
    void update(Channel channel, String notification) {
        System.out.println("Hello " + name + "\n" + channel.name + " " + notification);
    }
}
