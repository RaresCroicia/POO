public class TestTrain {
    public static void main(String[] args){
        Train tren = new Train("Bucuresti", "Constanta", new ClockTime(10, 30), new ClockTime(14, 00), true);
        System.out.println(tren);
    }
}
