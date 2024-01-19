package MVC_pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingCart model = new ShoppingCart();
        UserInterface view = new UserInterface();
        ShoppingController controller = new ShoppingController(model, view);

        Scanner scanner = new Scanner(System.in);

        // Simulate user interaction
        System.out.println("Enter the number of products to add to the cart: ");
        int numProducts = scanner.nextInt();

        for (int i = 1; i <= numProducts; i++) {
            Product product = controller.selectProduct(i);
            // Product product = new Product("Sample Product" + i, "Product description",
            // 19.99 + i, 50 + i);
            controller.addToCart(product);
        }
        scanner.close();
    }
}
