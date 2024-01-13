package Section7_OOP_Part1_Inheritance;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car();
//        car.setMake("Porsche");
//        car.setModel("Carrera");
//        car.setDoors(2);
//        car.setColor("black");
//        car.setConvertible(true);
//        System.out.println("make = " + car.getMake());
//        System.out.println("model = " + car.getModel());
//        car.describeCar();
//
//        Car targa = new Car();
//        targa.setMake("Porsche");
//        targa.setModel("Carrera");
//        targa.setDoors(2);
//        targa.setColor("red");
//        targa.setConvertible(false);
//
//        targa.describeCar();

        Account account = new Account();
//        account.setAccountNumber("9823478973");
//        account.setAccountBalance(BigDecimal.TEN);
//        account.setEmail("email@email.com");
//        account.setCustomerName("Jan Kowalski");
//        account.setPhoneNumber("123456789");

//        Account account = new Account("9823478973", BigDecimal.TEN, "Jan Kowalski", "email@email.com", "123456789");

        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountBalance());

        account.printInfo();
        account.withdrawfunds(BigDecimal.valueOf(100L));
        account.printInfo();
        account.withdrawfunds(BigDecimal.ONE);
        account.printInfo();
        account.depositFunds(BigDecimal.valueOf(30L));
        account.printInfo();

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println("AccountNo: " + timsAccount.getAccountNumber() +
                "; name " + timsAccount.getCustomerName());
    }


}
