public class ProductFactory {
    public static Product factory(String type, String nameProduct, Double productPrice) {
        if(type.equals("Book"))
            return new Book(nameProduct, productPrice);
        if(type.equals("Computer"))
            return new Computer(nameProduct, productPrice);
        if(type.equals("Beverage"))
            return new Beverage(nameProduct, productPrice);
        if(type.equals("Food"))
            return new Food(nameProduct, productPrice);
        return null;
    }
}
