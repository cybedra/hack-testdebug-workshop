package Activity2;
//Implementation for shopping cart
import java.util.ArrayList;
import java.util.List;

/*
 * In this activity you need to debug errors. Hint there are 5 errors in this implementation, find and fix them. 
 * After you fix all the errors, all the tests in ShoppingCartTest.java should pass.
 */

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<Product>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public int getItemCount() {
        return items.size();
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void clearCart() {
        items.clear();
    }

    public boolean isEmpty() {
        return items == null || items.isEmpty();
    }
}

public class StarterCode {
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product("Item1", 10.0);
        Product product2 = new Product("Item2", 15.0);

        // Creating a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart
        cart.addItem(product1);
        cart.addItem(product2);

        // Displaying cart information
        System.out.println("Items in the cart: " + cart.getItemCount());
        System.out.println("Total cost: " + cart.calculateTotal());

        // Removing an item from the cart
        cart.removeItem(product1);

        // Displaying updated cart information
        System.out.println("Items in the cart: " + cart.getItemCount());
        System.out.println("Total cost: " + cart.calculateTotal());

        // Clearing the cart
        cart.clearCart();

        // Displaying final cart information
        System.out.println("Cart is empty: " + cart.isEmpty());
    }
}
