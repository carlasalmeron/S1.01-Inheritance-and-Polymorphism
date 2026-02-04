package Exercise1L2;

public class Phone {
    protected String brand;
    protected String model;

    public Phone (String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call(String number) {
        System.out.println("Calling " + number);
    }
}
