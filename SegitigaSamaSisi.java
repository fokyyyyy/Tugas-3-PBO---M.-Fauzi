public class SegitigaSamaSisi extends Segitiga {
    public SegitigaSamaSisi(double sisi, String nama) {
        super(sisi, (Math.sqrt(3) / 2) * sisi, sisi, sisi, sisi, nama); // Sisi A, B, dan C sama
    }

    public void hitungLuas() {
        luas = 0.25 * Math.sqrt(3) * sisiA * sisiA; // Rumus luas segitiga sama sisi
    }

    public void hitungKeliling() {
        keliling = sisiA + sisiB + sisiC;
    }
}

