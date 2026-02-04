package Exercise1L1;

public class PercussionInstrument extends Instruments{

    static {
        System.out.println("Class Percussion");
    }

    public PercussionInstrument(String name, int price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing");
    }

    public static void sayHello(){
        System.out.println("Hello, I'm a percussion instrument");
    }
}
