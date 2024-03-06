public class SegitigaSembarang extends Segitiga {
    public SegitigaSembarang(double alas, double tinggi, double sisiA, double sisiB, double sisiC, String nama) {
        super(alas, tinggi, sisiA, sisiB, sisiC, nama);
    }

    public void hitungLuas() {
        double s = (sisiA + sisiB + sisiC) / 2;
        luas = Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    }

    public void hitungKeliling() {
        keliling = sisiA + sisiB + sisiC;
    }
}

