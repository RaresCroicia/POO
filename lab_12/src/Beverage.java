public class Beverage extends Product{

    public Beverage(String name, Double price) {
        super(name, price);
    }

    @Override
    public Double getPriceReduced() {
        return 5.0/100 * this.getPrice();
    }
}
