public class Test3 {
    public static void main(String[] args) {
        User user1 = new User("Mitrica");
        User user2 = new User("Marcel");
        User user3 = new User("User3");

        Channel channel1 = new Channel("Best gamer");
        Channel channel2 = new Channel("Worst gamer");

        channel1.subscribe(user1);
        channel1.subscribe(user2);
        channel2.subscribe(user2);
        channel2.subscribe(user3);

        channel1.notify("a postat un videoclip nou!");
        System.out.println("\n");
        channel2.notify("este live!");
    }
}
