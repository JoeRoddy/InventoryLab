/**
 * Created by Joe on 1/28/16.
 */
public class App {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Product apple = new Product(.70f,234,3);
        Product banana = new Product(.43f,125,2);
        Product lemon = new Product(.65f,066,2);
        Product diamond = new Product(9000.01f,001,9001);

        inventory.addProduct(apple); inventory.addProduct(banana); inventory.addProduct(lemon); inventory.addProduct(diamond);

        inventory.printInventory();

    }
}
