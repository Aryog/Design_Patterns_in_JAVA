package State_pattern;

interface OrderState {
    void processOrder(ContextOrder order);
}

// Concrete state classes

// Placed State
class PlacedState implements OrderState {
    @Override
    public void processOrder(ContextOrder order) {
        System.out.println("Order is in Placed state. Processing payment...");
        // Use the payment process here
        System.out.println("Payment Confirmed. Changing state to Processing.");
        order.setState(new ProcessingState());
    }
}

// Processing State
class ProcessingState implements OrderState {
    @Override
    public void processOrder(ContextOrder order) {
        System.out.println("Order is in Processing state. Packing items...");
        // Order packing logic here
        System.out.println("Items packed. Changing state to Shipped");
        order.setState(new ShippedState());
    }
}

// Shipped State
class ShippedState implements OrderState {
    @Override
    public void processOrder(ContextOrder order) {
        System.out.println("Order is in Shipped state. Out for delivery...");
        // Shipment logic
        System.out.println("Order delivered. Changing state to Delivered");
        order.setState(new DeliveredState());
    }
}

// Delivered state
class DeliveredState implements OrderState {
    @Override
    public void processOrder(ContextOrder order) {
        System.out.println("Order is in Delivered state. Order Completed.");
    }
}

// Cancelled state
class CancelledState implements OrderState {
    @Override
    public void processOrder(ContextOrder order) {
        System.out.println("Order is in Cancelled state. Cannot process further.");
    }
}