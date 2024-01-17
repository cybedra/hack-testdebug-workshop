package Activity1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest {

    //You will be working on ShoppingCart and Product class later so ignore the errors for now
    private ShoppingCart cart;
    private Product product1;
    private Product product2;

    @Before
    public void setUp() {
        cart = new ShoppingCart();
        product1 = new Product("Item1", 10.0);
        product2 = new Product("Item2", 15.0);
    }

    // this is an example test case written for you
    @Test
    public void testAddItemToCart() {
        cart.addItem(product1);
        assertEquals(1, cart.getItemCount());
    }

    @Test
    public void testRemoveItemFromCart() {
        //code here
    }

    @Test
    public void testCalculateTotal() {
        //code here
    }

    @Test
    public void testEmptyCartTotalIsZero() {
        //code here
    }

    @Test
    public void testAddMultipleItems() {
        //code here
    }

    @Test
    public void testRemoveNonexistentItem() {
        //code here
    }

    @Test
    public void testClearCart() {
        //code here
    }
}
