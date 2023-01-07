import java.util.ArrayList;

public class ShopSingleton {
    public String name;
    public ArrayList<Product> products;
    private static ShopSingleton obj;

    private ShopSingleton() {
        products = new ArrayList<>();
    }

    public static ShopSingleton getInstance() {
        if(obj == null)
            obj = new ShopSingleton();
        return obj;
    }

    public void showProducts() {
        for(Product product : products) {
            System.out.println(product);
        }
    }

}
