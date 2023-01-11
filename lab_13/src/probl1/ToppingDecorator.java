package probl1;

public abstract class ToppingDecorator implements IceCream {
    private IceCream tempIceCream;
    public ToppingDecorator(IceCream tempIceCream) {
        this.tempIceCream = tempIceCream;
    }

    public String getDescription() {
        return tempIceCream.getDescription();
    }

    public Double getCost() {
        return tempIceCream.getCost();
    }

}
