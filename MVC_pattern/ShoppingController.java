package MVC_pattern;

// Controller
public class ShoppingController {
    private ShoppingCart model;
    private UserInterface view;

    public ShoppingController(ShoppingCart model, UserInterface view) {
        this.model = model;
        this.view = view;
    }

    public Product selectProduct(int productId) {
        Product product = new Product("Sample Product " + productId, "Product Description", 19.99 + productId,
                50 + productId);
        view.displayProductDetails(product);
        return product;
    }

    public void addToCart(Product product) {
        model.addItem(product);
        view.displayShoppingCart(model);
    }
}
