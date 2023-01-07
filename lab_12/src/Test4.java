public class Test4 {
    public static void main(String[] args) {
        Pensionar pensionar1 = new Pensionar(22, 3500);
        Pensionar pensionar2 = new Pensionar(37, 3500);
        Pensionar pensionar3 = new Pensionar(51, 3500);

        System.out.println(pensionar1.getPensie());
        System.out.println(pensionar2.getPensie());
        System.out.println(pensionar3.getPensie());
    }
}
