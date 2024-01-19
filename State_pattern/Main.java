package State_pattern;

public class Main {
    public static void main(String[] args) {
        // Creating an order
        ContextOrder contextOrder = new ContextOrder();

        // Processing the order
        contextOrder.process(); // Placed to Processing
        contextOrder.process(); // Processing to Shipped
        contextOrder.process(); // Shipped to Delivered

        // Attempting to process a cancelled order
        contextOrder.setState(new CancelledState());
        contextOrder.process();
    }
}