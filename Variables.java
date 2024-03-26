import java.util.Arrays;

public class Variables {
    public static void main(String[] args) {
        char inisial = 'C'; /* Char adalah Type Data yang mnyimpan hanya satu karakter tunggal (1 huruf) */
        String nama = "Chaiden Richardo Foanto"; //String adalah type data berisi berbagai macam karakter sekaligus seperti huruf, angka, dan banyak karakter lainnya, yang biasanya ditulis diantara kutip dua
        int umur = 18; //tipe data ini untuk menyimpan sebuah angka bulat tanpa perlu menggunakan tanda kutip, tipe data integer memiliki range -2147483648 s/d 2147483647
        byte berat_badan = 55; //tipe data ini juga mirip dengan tipe data integer untuk menyimpan sebuah angka, tetapi byte memilki range paling kecil dibanding tipe data lain yang menyimpan angka karena range byte berkisar -128 s/d 127
        short angka_fav = 8; //tipe data ini masih sama mirip dengan tipe data integer untuk menyimpan sebuah angka tapi rangenya lebih besar dari byte dan lebih kecil dari integer, range dari type data short adalah -32768 s/d 32767
        long nik = 7371042604050001L; //tipe data ini mirip dnegan integer tapi digunakan saat nilainya berada di luar kapasitas rentang tipe int karena tipe long punya range sangat tinggi dibanding tipe data lainnya. range long adalah -9223372036854775808 s/d 9223372036854775807
        float tinggi = 171.7f; //float adalah tipe data menyimpan sebuah angka desimal, tetapi float hanya bisa menyimpan 6-7 angka dibelakang koma
        double pi = 3.14159265358979323846d; //sedangkan tipe data double, sama dengan float dia menyimpan sebuah angka desimal tapi tipe data double mampu menyimpan hingga 15 angka dibelaknag koma
        boolean menikah = false; //boolean adalah tipe data yang berisi pernyataan sebuah kondisi benar atau salah
        int[] countdown = {3,2,1}; //tipe data terstruktur yang merujuk kepada sebuah atau sekumpulan elemen yang mempunyai tipe data yang sama melalui indeks.


        System.out.println("Hi Pak Ano, ini biodata kuu xixixi\n");
        System.out.println("Huruf depan nama saya : " + inisial);
        System.out.println("Nama saya adalah : " + nama);
        System.out.println("Umur : "+umur);
        System.out.println("Berat Badan : "+berat_badan);
        System.out.println("Angka favorit saya : "+angka_fav);
        System.out.println("NIK : "+nik);
        System.out.println("Tinggi Badan : "+tinggi);
        System.out.println("Sebagai informasi nilai pi asli : "+ pi);
        System.out.println("Status Pernikahan : "+menikah);
        System.out.print("Countdown yang benar dimulai dari angka : "+ Arrays.toString(countdown));
        Arrays.sort(countdown);
        System.out.println(" bukan "+Arrays.toString(countdown));
    }
}
