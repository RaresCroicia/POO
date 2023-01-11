package probl1;

public class BasicIceCream implements IceCream{

    public BasicIceCream() {
        System.out.println("Se baga inghetata in con");
    }
    @Override
    public String getDescription() {
        return "E basic";
    }

    @Override
    public Double getCost() {
        return 0.5d;
    }
}
