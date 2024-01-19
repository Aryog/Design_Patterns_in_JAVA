package MVC_pattern;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private String description;
    private double price;
    private int stock;

    public Product(String name, String description, double price, int stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Getter and setters optional
    @Override
    public String toString() {
        return "Product: " + name + ", Description: " + description + ", Price:$" + price;
    }
}

class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        // Check if the item is in stock before adding it to cart
        if (product.getStock() > 0) {
            // Deduct the item from product stock
            product.setStock(product.getStock() - 1);
            items.add(product);
            System.out.println("Item added to the cart: " + product.getName());
            updateInventory(product);
        } else {
            System.out.println("Sorry, the item is out of stock.");
        }
    }

    private void updateInventory(Product product) {
        // Logic to inventory, trigger events.
        System.out.println("Inventory updated after adding item to the cart.");
    }

    public List<Product> getItems() {
        return items;
    }
}