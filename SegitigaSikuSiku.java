public class SegitigaSikuSiku extends Segitiga {
    public SegitigaSikuSiku(double alas, double tinggi, double sisiA, String nama) {
        super(alas, tinggi, sisiA, 10, 12, nama); // Sisi B dan Sisi C tidak diperlukan untuk SegitigaSikuSiku
    }


    public void hitungLuas() {
        luas = 0.5 * alas * tinggi;
    }


    public void hitungKeliling() {
        keliling = alas + tinggi + sisiA ;
    }
}
