public class TestPunct {
    public static void main(String[] args){
        Punct punctA = new Punct();
        Punct punctB = new Punct();
        punctA.setX(1);
        punctA.setY(2);
        punctB.setX(-1);
        punctB.setY(3);
        System.out.println(punctA.distance(punctB));

    }
}
