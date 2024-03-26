public class App {
    public static void main(String[] args) throws Exception {
        Tabung tabung = new Tabung("tabung", 25, 7); // update: penambahan argumen
        Kubus kubus = new Kubus("kubus", 5);
        Balok balok = new Balok("balok", 4, 5, 6);

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
    }
}
