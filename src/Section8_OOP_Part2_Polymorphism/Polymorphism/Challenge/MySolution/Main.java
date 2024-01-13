package Section8_OOP_Part2_Polymorphism.Polymorphism.Challenge.MySolution;

public class Main {

    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//        while (true) {
//            System.out.println("Enter Type of Car (G for Gas Powered Car, E for Electric Car, H for Hybrid Car, or Q to Quit): ");
//            String type = s.nextLine();
//            if ("Qq".contains(type)) {
//                break;
//            }
//            System.out.println("Enter description of the Car: ");
//            String description = s.nextLine();
//            Car car = Car.getCar(type, description);
//            car.startEngine();
//            car.runEngine();
//            car.drive();
//        }

//        Car car = Car.getCar("E", "Tesla");
//        car.drive();

        Object unknownObject = Car.getCar("G", "BMW");
        System.out.println(unknownObject.getClass().getSimpleName());
        if (unknownObject.getClass().getSimpleName().equals("GasPoweredCar")) {
            GasPoweredCar gpc = (GasPoweredCar) unknownObject;
            gpc.startEngine();
            gpc.drive();
            gpc.gasPoweredCarDescription();
        } else if (unknownObject instanceof ElectricCar) {
            ((ElectricCar) unknownObject).electricCarDescription();
        } else if (unknownObject instanceof HybridCar hc) {
            hc.hybridCarDescription();
        }

    }
}
