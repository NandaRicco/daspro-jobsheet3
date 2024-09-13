import java.util.Scanner;

public class kafe14 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //Untuk memanggil Scanner

        boolean keanggotaan; //Untuk memberi tahu bahwa ada variabel bentuk boolean dengan nama keanggotaan
        int jmlKopi, jmlTeh, jmlRoti; //Untuk memberi tahu bahwa ada variabel bentuk int dengan nama jmlKopi, jmlTeh, jmlRoti
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, nominalBayar, totalHarga; //Untuk memberi tahu bahwa ada variabel bentuk double dengan nama hargaKopi, hargaTeh, hargaRoti, nominalBayar, totalHarga
        float diskon = 10 / 100f; //Untuk memberi tahu bahwa ada variabel bentuk float dengan nama diskon
        byte nominalInt; //Untuk casting dari pertanyaan di jobsheet

        System.out.print("Masukkan keanggotaan (true/false): "); //Untuk memberi tahu ini akan mengisi variabel mana
        keanggotaan = input.nextBoolean(); //Untuk mengisi velue variabel keanggotaan
        System.out.print("Masukkan jumlah pembelian Kopi: "); //Untuk memberi tahu ini akan mengisi variabel mana
        jmlKopi = input.nextInt(); //Untuk mengisi velue variabel jmlKopi
        System.out.print("Masukkan jumlah pembelian Teh: "); //Untuk memberi tahu ini akan mengisi variabel mana
        jmlTeh = input.nextInt(); //Untuk mengisi velue variabel jmlTeh
        System.out.print("Masukkan jumlah pembelian Roti: "); //Untuk memberi tahu ini akan mengisi variabel mana
        jmlRoti = input.nextInt(); //Untuk mengisi velue variabel jmlRoti

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti); //Untuk menghitung total harga

        nominalBayar = totalHarga - (diskon * totalHarga); //Untuk menghitung harga setelah diskon
        nominalInt = (byte) nominalBayar; //Untuk mengubah nilai float menjadi byte

        System.out.println("keanggotaan pelanggan " + keanggotaan); //Untuk menampilkan output keanggotaan pelanggan
        System.out.println("Item pembelian " + jmlKopi + "kopi, " + jmlTeh + "teh, " + jmlRoti + "roti"); //Untuk menampilkan output item apa saja yang di beli
        System.out.println("Nominal bayar Rp " + nominalBayar); //Untuk menampilkan nominal yang harus di bayar
        System.out.println(nominalInt); //Untuk menampilkan nilai float yang di convert menjadi byte
    }
}
