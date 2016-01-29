/**
 * Created by Joe on 1/28/16.
 */
public class Product {
    private float price;
    private int id;
    private int quantityAvailable;


    public Product(float price, int id, int quantityAvailable) {

        this.price = price;
        this.id = id;
        this.quantityAvailable = quantityAvailable;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }
}
