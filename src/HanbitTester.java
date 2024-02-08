public class HanbitTester {
    private HanbitRadio radio;
    public HanbitTester() {
        this.radio = new HanbitRadio();
    }

    public void test() {
        for (int i = 0; i < 5; i++) {
            radio.powerOn();
            radio.powerOff();
        }
    }
}
