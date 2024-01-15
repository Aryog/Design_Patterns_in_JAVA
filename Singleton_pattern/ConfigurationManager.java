package Singleton_pattern;

public class ConfigurationManager {

    // The single instance of the ConfigurationManager Class
    private static ConfigurationManager instance;

    // Configuration data
    private String databaseUrl;
    private String username;
    private String password;

    // Private constructor to prevent instantiation from outside the class
    private ConfigurationManager() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        this.username = "admin";
        this.password = "password123";
    }

    // Public method to get the instance of the ConfigurationManager class
    public static ConfigurationManager getInstance() {
        // Lazy initialization: Create the instance only if it doesn't exist yet
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Methods to access configuration data
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}