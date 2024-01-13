package Section7_OOP_Part1_Inheritance;

public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Customer(String name, double limit, String email) {
        this.name = name;
        this.creditLimit = limit;
        this.emailAddress = email;
        System.out.println("constructor 1");
    }

    public Customer() {
        this("John", "john.smith@email.com");
        System.out.println("constructor 2");
    }

    public Customer(String name, String email) {
        this(name, 12.0, email);
        System.out.println("constructor 3");
    }
}
