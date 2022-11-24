

public class Problema_2 {
    public static void main(String[] args){
        Rectangle rc = new Rectangle();
        // rc = new Shape(); nu merge
        //rc = new Square();

        System.out.println((rc instanceof Shape));
        System.out.println((rc instanceof Square));

        Square sq;
        //Conversie 1 --
        Circle c1 = new Circle();
        // Square sq = (Square) c1; nu e posibil
        //Conversie 2 -- downcasting
        Rectangle r = new Rectangle(5.0, 5.0);
        sq = (Square) r;
        //Conversie 3 -- upcasting
        sq = new Square(7.0);
        r = sq;
    }
}
