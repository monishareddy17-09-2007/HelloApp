
//UC6
public class App {
    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Enhanced for-loop (for-each)
            String names = "";

            // Enhanced for-loop to build names string
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
                names += name + ", ";
            }

            // Remove trailing comma and space using substring
            names = names.substring(0, names.length() - 2);

            // Final greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}