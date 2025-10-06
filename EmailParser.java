import java.util.Scanner;

public class EmailParser {
    // Function to parse the first and last names from email.
    public static String parseNameFromEmail(String email) {
        // Find the position of the @ in the email.
        int atIndex = email.indexOf('@');
        // If the @ isn't found, return an error message.
        if (atIndex == -1) {
            return "Invalid email: missing '@'";
        }
        // Get the part before @ (the username).
        String username = email.substring(0, atIndex);
        // Split the username by a dot to separate first and last names.
        String[] parts = username.split("\\.");
        // If there aren't exactly two parts, return an error message.
        if (parts.length != 2) {
            return "Invalid email: username should be 'firstname.lastname'";
        }
        // Return the first and last names separated by a space (with the dot removed).
        return parts[0] + " " + parts[1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner for input.
        System.out.print("Enter an email address: "); // Prompt the user for their email address with the first.last format.
        String email = scanner.nextLine(); // Read user input.
        String result = parseNameFromEmail(email); // Parse the email.
        System.out.println("Result: " + result); // Print the result.
        System.out.println("Test: " + parseNameFromEmail("john.doe@example.com")); // Testing the function with simple John Doe function.
        scanner.close();
    }
}
