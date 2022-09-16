public class MainApp {
    public static void main(String[] args) {
        //panggil class PesawatTelpon
        PesawatTelpon m = new PesawatTelpon();
        //[nama class] [variabel buatanmu] = new [nama class]();

        m.setTransmiter("Dengan Siapa?");
        System.out.println("Saya Berbicara "+ m.getTransmiter());

    }
}