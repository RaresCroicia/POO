import java.util.ArrayList;

public class Test2 {

    public void addProduct(Product product) {
        ShopSingleton.getInstance().products.add(product);
    }

    public void removeProduct(Product product) {
        ShopSingleton.getInstance().products.remove(product);
    }

    public Product getCheapestProduct() {
        ArrayList<Product> products = ShopSingleton.getInstance().products;
        Double minPrice = 1000.0;
        Product lowProduct = null;
        for(Product product : products) {
            if(lowProduct == null)
                lowProduct = product;
            else {
                if(lowProduct.getPrice() > product.getPrice())
                    lowProduct = product;
            }
        }
        return lowProduct;
    }

    public static void main(String[] args) {
        Product product = ProductFactory.factory("Food", "Salam", 3.0);
        Test2 obj = new Test2();
        obj.addProduct(product);
        obj.addProduct(
                ProductFactory.factory("Book", "Biblia", 100.0));
        obj.addProduct(
                ProductFactory.factory("Computer", "Cu i9", 1000.0));

        ShopSingleton.getInstance().showProducts();

        System.out.println(product.getPriceReduced());

        System.out.println(obj.getCheapestProduct());


    }
}
