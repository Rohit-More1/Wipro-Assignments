package ExceptionAssignment;

import java.util.Scanner;

// Custom exception for invalid username
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

// Custom exception for invalid password
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

// Login class with username and password validation
public class Login {
    private String username;
    private String password;

    public Login(String username, String password) throws InvalidUsernameException, InvalidPasswordException {
        // Validate username
        if (username == null ) {
            throw new InvalidUsernameException("Username cannot be null or empty.");
        }

        // Validate password
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long.");
        }
        
        if (!password.matches(".*[!@#$%^&*()].*")) {
            throw new InvalidPasswordException("Password must contain at least one special character.");
        }

        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user to input username
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            // Prompt user to input password
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Create a new Login instance to validate the inputs
            Login login = new Login(username, password);
            System.out.println("Login successful.");

        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
