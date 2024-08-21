public class StringManip {

    public static void main(String... args) {

        // Using varargs allows for various calling methods
        concatArgsEllipses("Without ", "Curly ", "Braces");
        concatArgsEllipses(new String[] {"As ", "An ", "Array"});
        concatArgsEllipses(); // Or even empty!

        // Using String array limits to one call method
        String[] bracketArg = {"Only ", "An ", "Array"};
        concatArgsBrackets(bracketArg);

        // Print out the command line args
        for (String temp : args) {
            System.out.println(temp);
        }
    }

    // Input args as varargs
    public static void concatArgsEllipses(String... args) {

        // Using StringBuilder allows for efficient String expansion
        StringBuilder printOut = new StringBuilder("Hello, ");

        // Add each element in list input
        for (String temp : args) {
            printOut.append(temp);
        }

        printOut.append("!");
        System.out.println(printOut);
    }

    // Input args as array
    public static void concatArgsBrackets(String[] args) {

        // Using StringBuilder allows for efficient String expansion
        StringBuilder printOut = new StringBuilder("Hello, ");

        // Add each element in list input
        for (String temp: args) {
            printOut.append(temp);
        }

        printOut.append("!");
        System.out.println(printOut);
    }

}