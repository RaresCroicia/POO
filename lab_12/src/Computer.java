public class Computer extends Product{
    public Computer(String name, Double price) {
        super(name, price);
    }

    @Override
    public Double getPriceReduced() {
        return 1.0/10 * this.getPrice();
    }
}
