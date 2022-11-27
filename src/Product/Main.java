package Product;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {

        Product sugar = new Product("сахар", 59, 1);
        Product egg = new Product("яйцо", 6, 78);
        Product flour = new Product("мука", 1, 95);
        Product tomato = new Product("помидор", 102, 1);
        Product cucumber = new Product("огурец", 142, 1);
        Product onion = new Product("лук", 15, 1);
        ProductList productList1 = new ProductList();
        ProductList productList2 = new ProductList();
        productList1.addProduct(sugar);
        productList1.addProduct(egg);
        productList1.addProduct(flour);
        productList2.addProduct(tomato);
        productList2.addProduct(cucumber);
        productList2.addProduct(onion);
        System.out.println(productList1);
        System.out.println(productList2);
        Recipe cake = new Recipe("Topt",productList1);
        Recipe salad = new Recipe("салат", productList2);
    }
}

