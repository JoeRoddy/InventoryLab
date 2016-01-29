import java.util.ArrayList;

/**
 * Created by Joe on 1/28/16.
 */
public class Inventory {
    private ArrayList<Product> productsOnHand = new ArrayList<Product>();

    public void addProduct(Product productToAdd){
        productsOnHand.add(productToAdd);
    }

    public float computeTotalValue(){
        float totalValue = 0.00f;
        float productValue;
        Product product;
        int size = productsOnHand.size();
        for (int x =0;x<size;x++){
            product = productsOnHand.get(x);
            productValue = product.getPrice()*product.getQuantityAvailable();
            totalValue+=productValue;
        }
        return totalValue;
    }

    public void printInventory(){
        int size = productsOnHand.size();
        System.out.println("PRODUCTS IN INVENTORY: \n");
        Product product;
        for (int x =0;x<size;x++){
            product=productsOnHand.get(x);
            System.out.println("Product ID#: "+product.getId()+"\n");
            System.out.println("Unit Price :"+product.getPrice()+"\n");
            System.out.println("Quantity   :"+product.getQuantityAvailable()+"\n \n");
        }
        System.out.println("Total Inventory Value: $"+this.computeTotalValue());
    }

    public ArrayList<Product> getProductsOnHand() {
        return productsOnHand;
    }


}
