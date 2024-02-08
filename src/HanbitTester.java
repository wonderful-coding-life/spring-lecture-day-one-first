public class HanbitTester {
    private HanbitTelevision television;
    public HanbitTester() {
        this.television = new HanbitTelevision();
    }

    public void test() {
        for (int i = 0; i < 5; i++) {
            television.powerOn();
            television.powerOff();
        }
    }
}
