public class Main {
    public static void main(String[] args) {
        HanbitTester tester = new HanbitTester(new HanbitTelevision());
        tester.test();
        tester = new HanbitTester(new HanbitRadio());
        tester.test();
    }
}