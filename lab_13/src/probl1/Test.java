package probl1;

public class Test {
    public static void main(String[] args) {
        IceCream inghetata = new BasicIceCream();
        inghetata = new Chocolate(inghetata);
        inghetata = new Vanilla(inghetata);
        System.out.println("Inghetata costa " + inghetata.getCost() + " lei");
        System.out.println(inghetata.getDescription());
        IceCream inghetataIeftina = new BasicIceCream();
        inghetataIeftina = new Chocolate(inghetataIeftina);
        System.out.println(inghetataIeftina.getDescription());
    }
}
