public class Food extends Product{
    public Food(String name, Double price) {
        super(name, price);
    }

    @Override
    public Double getPriceReduced() {
        return 1.0/5 * this.getPrice();
    }
}
