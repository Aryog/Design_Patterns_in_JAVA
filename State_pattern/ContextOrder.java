package State_pattern;

public class ContextOrder {
    private OrderState state;

    public ContextOrder() {
        this.state = new PlacedState();
    }

    public void process() {
        state.processOrder(this);
    }

    public void setState(OrderState state) {
        this.state = state;
    }
}
