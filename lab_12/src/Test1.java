import java.util.ArrayList;

public class Test1 {

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
        Test1 obj = new Test1();
        Product product = new Food("paine", 2.0);
        obj.addProduct(new Food("salam", 10.0));
        obj.addProduct(new Food("branza", 5.5));
        obj.addProduct(product);
        ShopSingleton.getInstance().showProducts();
        System.out.println(obj.getCheapestProduct());
        obj.removeProduct(product);
        System.out.println(obj.getCheapestProduct());
        ShopSingleton.getInstance().showProducts();

    }
}
