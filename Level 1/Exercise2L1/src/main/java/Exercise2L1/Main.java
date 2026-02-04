package Exercise2L1;

public class Main {
    public static void main(String[] args) {

        Car.brake();

        Car car1 = new Car(1000);
        Car car2 = new Car(1100);

        Car.model = "Toyota";
        System.out.println("Model Car1: " + car1.model);
        System.out.println("Model Car2: " + car2.model);

        Car.model = "Ferrari";
        System.out.println("Model Car1: " + car1.model);
        System.out.println("Model Car2: " + car2.model);

        car1.accelerate();

        System.out.println("Power Car2: "+ car2.POWER);

    }
}
