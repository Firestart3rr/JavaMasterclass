package Section7_OOP_Part1_Inheritance.String;

public class Main2 {

    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t \n");

        String helloworld = "Hello World";
        System.out.printf("index of r = %d %n", helloworld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloworld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloworld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloworld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n", helloworld.indexOf('l', 3));
        System.out.printf("index of l = %d %n", helloworld.lastIndexOf('l', 8));

        String helloWorldLower = helloworld.toLowerCase();
        if (helloworld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloworld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }
        if (helloworld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloworld.endsWith("World")) {
            System.out.println("String ends with World");
        }
        if (helloworld.contains("World")) {
            System.out.println("String contains World");
        }

        if (helloworld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is blank");
        }
        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
