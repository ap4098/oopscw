public class HelloWithName {

    public static void main(String[] args) {

        // ----------- Step 1: Validate Input -----------
        if (args.length == 0) {
            System.out.println("Hello, World!");
            System.out.println("No name provided as command-line argument.");
            return;
        }

        // ----------- Step 2: Store User Input -----------
        String userName = args[0];

        // ----------- Step 3: Validate Name -----------
        if (userName.trim().isEmpty()) {
            System.err.println("Error: Name cannot be empty!");
            System.exit(1);
        }

        // ----------- Step 4: Format Name -----------
        // Capitalize first letter (optional enhancement)
        String formattedName = userName.substring(0, 1).toUpperCase() 
                             + userName.substring(1).toLowerCase();

        // ----------- Step 5: Display Greeting -----------
        System.out.println("Hello, " + formattedName + "!");

        // ----------- Step 6: Additional Info -----------
        System.out.println("Welcome to the Java Program.");
        System.out.println("Your name length is: " + formattedName.length());
    }
}