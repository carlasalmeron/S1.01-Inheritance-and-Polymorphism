package Exercise2L1;

public class Car {
    static final String BRAND = "Audi";
    static String model;
    final int POWER;

    public Car(int power) {
        this.POWER = power;
    }

    public static void brake() {
        System.out.println("The vehicle is braking");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating");
    }

}
