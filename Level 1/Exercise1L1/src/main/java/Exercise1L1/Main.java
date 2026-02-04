package Exercise1L1;

public class Main {
    public static void main(String[] args) {

        WindInstrument.sayHello();
        StringInstrument.sayHello();
        PercussionInstrument.sayHello();

        Instruments windInstrument = new WindInstrument("Flauta", 250);
        Instruments stringInstrument = new StringInstrument("Violín", 500);
        Instruments percussionInstrument = new PercussionInstrument("Batería", 1000);

        windInstrument.play();
        stringInstrument.play();
        percussionInstrument.play();

    }
}
