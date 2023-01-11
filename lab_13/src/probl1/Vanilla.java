package probl1;

public class Vanilla extends ToppingDecorator implements IceCream{
    public Vanilla(IceCream tempIceCream) {
        super(tempIceCream);
        System.out.println("Se adauga vanilia!");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Vanilie";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 2d;
    }
}
