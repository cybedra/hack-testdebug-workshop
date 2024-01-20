package Activity1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
        cart.addItem(product1);
        assertEquals(0, cart.getItemCount());
    }

    @Test
    public void testCalculateTotal() {
        assertEquals(0.0, cart.calculateTotal());
        cart.addItem(product1);
        assertEquals(10.0, cart.calculateTotal());
        cart.addItem(product2);
        assertEquals(10.0 + 15.0, cart.calculateTotal());
    }

    @Test
    public void testEmptyCartTotalIsZero() {
        assertEquals(0.0, cart.calculateTotal());
    }

    @Test
    public void testAddMultipleItems() {
        cart.addItem(product1);
        assertEquals(1, cart.getItemCount());
        cart.addItem(product2);
        assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testRemoveNonexistentItem() {
        cart.addItem(product1);
        cart.removeItem(product2);
        assertEquals(1, cart.getItemCount());
    }

    @Test
    public void testClearCart() {
        cart.addItem(product1);
        cart.addItem(product2);
        cart.clearCart();
        assertEquals(0, cart.getItemCount());
    }
}
