package Strategy_pattern;

public class Main {
    public static void main(String[] args) {
        NavigationApp navigationApp = new NavigationApp();

        // User selects the fastest route strategy
        navigationApp.setRouteStrategy(new FastestRouteStrategy());
        navigationApp.navigate();

        // User switches to the shortest route strategy
        navigationApp.setRouteStrategy(new ShortestRouteStrategy());
        navigationApp.navigate();
    }
}