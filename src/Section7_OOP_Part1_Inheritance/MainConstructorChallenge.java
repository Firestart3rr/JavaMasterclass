package Section7_OOP_Part1_Inheritance;

public class MainConstructorChallenge {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Tim", 5.0, "tim@mit.com");
        System.out.println("name: " + customer1.getName() + "; creditLimit: " + customer1.getCreditLimit() + "; customerEmail: " + customer1.getEmailAddress());
        System.out.println();

        Customer customer2 = new Customer();
        System.out.println("name: " + customer2.getName() + "; creditLimit: " + customer2.getCreditLimit() + "; customerEmail: " + customer2.getEmailAddress());
        System.out.println();

        Customer customer3 = new Customer("Robert", "rob@email.com");
        System.out.println("name: " + customer3.getName() + "; creditLimit: " + customer3.getCreditLimit() + "; customerEmail: " + customer3.getEmailAddress());
        System.out.println();
    }
}
