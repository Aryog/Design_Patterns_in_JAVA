package Singleton_pattern;

public class MyApp {
    public static void main(String[] args) {
        // Get the instance of the ConfigurationManager
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Access configuration settings
        String databaseUrl = configManager.getDatabaseUrl();
        String username = configManager.getUsername();
        String password = configManager.getPassword();

        // Use the configuration settings in your application
        System.out.println("Database URL: " + databaseUrl);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
