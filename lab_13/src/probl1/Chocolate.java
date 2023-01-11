package probl1;

public class Chocolate extends ToppingDecorator implements IceCream{
    public Chocolate(IceCream tempIceCream) {
        super(tempIceCream);
        System.out.println("Se adauga ciocolata!");
    }

    public String getDescription(){
        return super.getDescription() + " + Ciocolata";
    }

    public Double getCost() {
        return super.getCost() + 1.5d;
    }
}
