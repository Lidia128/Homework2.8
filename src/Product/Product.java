package Product;
import java.util.Objects;
public class Product {
    private final String name;
    private final double price;
    private final int weight;
    private boolean cheked;
    public Product(String name, double price, int weight) {
        if (name == null || name.isBlank() || price < 0 || weight < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.cheked = false;
    }
    public String getName() {return name;}
    public double getPrice() {return price;}
    public double getWeight() {return weight; }
    public void setCheked() {this.cheked = true;}
    public boolean isCheked() {return cheked; }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
    @Override
    public String toString() {
        String checkedString = this.isCheked() ? "Да" : "Нет";
        return String.format("%s, Цена : %s, Количество : %s, Куплен : %s",
                this.name, this.price, this.weight, checkedString);
    }
}
