public class MainApp {
    public static void main(String[] args) {
        //panggil class Telpon
        Telpon m = new Telpon();
        //[nama class] [variabel buatanmu] = new [nama class]();

        m.setTransmiter("Dengan Siapa?");
        System.out.println("Saya Berbicara "+ m.getTransmiter());

    }
}
