public class App {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(7, "Lingkaran 123");
        lingkaran.getInfo();

        // Segitiga
        Segitiga segitiga = new Segitiga(10, 8, 5, 3, 4, "Segitiga 123");
        segitiga.getInfo();

        //sikusiku
        SegitigaSikuSiku segitigaSikuSiku = new SegitigaSikuSiku(3, 4, 5,  "Segitiga Siku-Siku 123");
        segitigaSikuSiku.getInfo();

        //segitigasembarang
        SegitigaSembarang segitigaSembarang = new SegitigaSembarang(3, 4, 5, 6, 7, "Segitiga Sembarang");
        segitigaSembarang.getInfo();
        
        //segitigasembarang
        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(3, "Sama Sisi");
        segitigaSamaSisi.getInfo();


    }
}
