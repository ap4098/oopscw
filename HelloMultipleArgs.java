public class HelloMultipleArgs {
    public static void main(String[] args) {

        // Default case: no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build greeting message
        String greeting = "Hello, ";

        for (String name : args) {
            greeting += name + ", ";
        }

        // Remove trailing ", "
        greeting = greeting.substring(0, greeting.length() - 2);

        // Print result
        System.out.println(greeting);
    }
}