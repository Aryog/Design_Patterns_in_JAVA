package MVC_pattern;

public class UserInterface {
    public void displayProductDetails(Product product) {
        System.out.println(
                "Product Details: " + product.getName() + ", " + product.getDescription() + ", $" + product.getPrice());
    }

    public void displayShoppingCart(ShoppingCart shoppingCart) {
        // Display the contents of the shopping cart
        System.out.println("Shopping Cart Contents:");
        for (Product item : shoppingCart.getItems()) {
            System.out.println("- " + item.getName() + ", $" + item.getPrice());
        }
    }
}
