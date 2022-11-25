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
        ProductList productList = new ProductList();
        productList.addProduct(sugar);
        productList.addProduct(egg);
        productList.addProduct(flour);
        System.out.println(productList);
        Recipe cake = new Recipe("Topt", ProductList);
    }

}

