package Singleton;

public class Logger {
    // Step 1: Private static instance variable
    private static Logger instance;

    // Step 2: Private constructor
    private Logger() {
        // Optional: initialization code
    }

    // Step 3: Public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example logging method
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}