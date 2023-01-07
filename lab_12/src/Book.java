public class Book extends Product{

    public Book(String name, Double price) {
        super(name, price);
    }

    @Override
    public Double getPriceReduced() {
        return 15.0/100 * this.getPrice();
    }

}
