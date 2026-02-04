package Exercise1L2;

public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePhoto () {
        System.out.println("The camera is taking a photo");
    }

    @Override
    public void ringAlarm () {
        System.out.println("The alarm is ringing");
    }
}