package Exercise1L1;

public class StringInstrument extends Instruments{

    static {
        System.out.println("Class String Instrument");
    }

    public StringInstrument(String name, int price){
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A string instrument is playing");
    }

    public static void sayHello(){
        System.out.println("Hello, I'm a string instrument");
    }
}
