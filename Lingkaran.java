public class Lingkaran extends BangunDatar {
    protected  double r;
    //private double keliling;

    public Lingkaran(double r, String nama) {
        super.setNama(nama);
        this.r = r;
        this.hitungLuas();
        this.hitungKeliling();
    }

    public void hitungLuas (){
        luas = 3.14 * r * r;
    }

    public void hitungKeliling (){
        keliling = 2 * 3.14 * r;
    }
}
