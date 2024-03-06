public class Segitiga extends BangunDatar {
  protected double alas;
  protected double tinggi;
  protected double sisiA;
  protected double sisiB;
  protected double sisiC;

  // Konstruktor untuk Segitiga
  public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC, String nama) {
      super.setNama(nama);
      this.alas = alas;
      this.tinggi = tinggi;
      this.sisiA = sisiA;
      this.sisiB = sisiB;
      this.sisiC = sisiC;

      hitungLuas();
      hitungKeliling();
  }
  public void hitungLuas() {
    luas = 0.5 * alas * tinggi; 
  }

  public void hitungKeliling() {
    keliling = sisiA + sisiB + sisiC; 
  }

}