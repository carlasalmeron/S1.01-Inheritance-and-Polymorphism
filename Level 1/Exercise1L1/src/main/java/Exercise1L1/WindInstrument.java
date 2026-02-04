package Exercise1L1;

public class WindInstrument extends Instruments {

    static {
        System.out.println("Class WindInstrument");
    }

    public WindInstrument(String name, int price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing");
    }

    public static void sayHello(){
        System.out.println("Hello, I'm a wind instrument");
    }

}
