import static org.junit.Assert.*;
import org.junit.Test;
public class InventoryTest {

    @Test
    public void tester(){
        //testing computeTotalValue
        Inventory test = new Inventory();
        Product apple = new Product(.70f,234,3);
        Product banana = new Product(.43f,125,2);
        Product lemon = new Product(.65f,066,2);

        test.addProduct(apple); test.addProduct(banana); test.addProduct(lemon);

        float total = test.computeTotalValue();
        //426
        System.out.println(total);
        assertTrue("Error: computeTotalValue() returns incorrect answer.", total==4.26f);

    }
}
