public class Perhitungan implements Interfaces {
    public int a;
    private int b;
    private int Hasil;

    public Perhitungan(int a, int b, int Hasil){
        this.a = a;
        this.b = b;
        this.Hasil = Hasil;
        printjudulclass("jadi judul class perhitungan");
        }
    private void printjudulclass(String jdl) {
        System.out.println(jdl);
    }
    public void PrintJudul(){
        System.out.println("Judul Dalam Interfaces");
    }
    public void HitungTambah(){
        this.Hasil = this.a + this.b;
    }
    public void HitungKali(){
        this.Hasil = this.a + this.b;
    }
    public int Hasil_Tmbah(int a1, int b2){
        this.a = a1;
        this.b = b2;
        HitungTambah();
        return this.Hasil;
    }
    public int Hasil_Kali(int _a,int _b){
        this.a = _a;
        this.b = _b;
        HitungKali();
        return this.Hasil;
    }
}
