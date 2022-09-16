public class MainApp {

    public static void main(String[] args) {
        //panggil class Hewan
        Hewan m = new Hewan();
        //[nama class] [variabel buatanmu] = new [nama class]();

        m.setMata("Hitam");
        System.out.println("Mataku "+ m.getMata());

    }
}