public class JumlahPerhitungan {
    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4,5,0);
        System.out.println("---------------------------");
        System.out.println("Hasil Pertambahan : ");
        int HasilTambahan = s.Hasil_Tmbah(30,2);
        System.out.println(HasilTambahan);

        System.out.println("-------------------------");
        System.out.println("Hasil  Perkalihan : ");
        int HasilPerkalihan = s.Hasil_Kali(899,900);
        System.out.println(HasilPerkalihan);
    }
}
