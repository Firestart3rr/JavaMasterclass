package Section8_OOP_Part2_Polymorphism.Polymorphism.Challenge.MySolution;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println(description + " started its engine");
    }

    public void drive() {
        runEngine();
        System.out.println(description + " is driving");
    }

    protected void runEngine() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println("The engine of " + instanceType + " is running");
    }

    public static Car getCar(String type, String description) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'G' -> new GasPoweredCar(description, 15.0, 6);
            case 'E' -> new ElectricCar(description, 400.0, 80);
            case 'H' -> new HybridCar(description, 50.0, 20, 3);
            default -> new Car(description);
        };
    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("brum brum");
    }

    @Override
    public void drive() {
        super.drive();
    }

    public void gasPoweredCarDescription() {
        System.out.println("Best type of cars ;)");
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public void electricCarDescription() {
        System.out.println("The electric car is powered by " + this.batterySize + "kWh battery and its able to run " + this.avgKmPerCharge + "km per one charge");
    }
}

class HybridCar extends Car {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinder;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinder) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinder = cylinder;
    }

    public void hybridCarDescription() {
        System.out.println("Hybrid car's drivetrain consists of an electric and gasoline engine \n" +
                "It can drive " + this.avgKmPerLitre + "km per litre, thanks to" + this.batterySize + "kWh battery and " + this.cylinder + "cylinder engine");
    }
}
