package Strategy_pattern;

// Step 1: Strategy Interface
public interface RouteStrategy {
    void calculateRoute();
}

// Step 2: Concrete Strategies
class FastestRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute() {
        System.out.println("Calculating the fastest route...");
    }
}

class ShortestRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute() {
        System.out.println("Calculating the shortest route...");
    }
}

// Step 3: Context
class NavigationApp {
    private RouteStrategy routeStrategy;

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void navigate() {
        System.out.println("Using the selected route strategy:");
        routeStrategy.calculateRoute();
    }
}