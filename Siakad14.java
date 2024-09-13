import java.util.Scanner;

public class Siakad14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //Untuk memanggil Scanner

        String nama, nim, kelas; //Buat memberi tahu bahwa ada variabel bentuk String dengan nama variabel nama dan nim
        //char kelas; //Buat memberi tahu bahwa ada variabel bentuk char dengan nama variabel char
        byte absen; //Buat memberi tahu bahwa ada variabel bentuk byte dengan nama variabel absen
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir; //Buat memberi tahu bahwa ada variabel bentuk double dengan nama nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir 

        System.out.print("Masukan Nama: "); //Untuk memberi tahu ini akan mengisi variabel mana
        nama = sc.nextLine(); //Untuk mengisi velue variabel nama
        System.out.print("Masukan NIM: "); //Untuk memberi tahu ini akan mengisi variabel mana
        nim = sc.nextLine(); //Untuk mengisi velue variabel nim
        System.out.print("Masukan Kelas: "); //Untuk memberi tahu ini akan mengisi variabel mana
        kelas = sc.nextLine();//.charAt(0); //Untuk mengisi velue variabel kelas
        System.out.print("Masukan nomer absen: "); //Untuk memberi tahu ini akan mengisi variabel mana
        absen = sc.nextByte(); //Untuk mengisi velue variabel absen
        System.out.print("Masukan nilai kuis: "); //Untuk memberi tahu ini akan mengisi variabel mana
        nilaiKuis = sc.nextDouble(); //Untuk mengisi velue variabel nilai kuis
        System.out.print("Masukan nilai tugas: "); //Untuk memberi tahu ini akan mengisi variabel mana
        nilaiTugas = sc.nextDouble(); //Untuk mengisi velue variabel nilai tugas
        System.out.print("Masukan nilai UTS: "); //Untuk memberi tahu ini akan mengisi variabel mana
        nilaiUTS = sc.nextDouble(); //Untuk mengisi velue variabel nilai UTS
        System.out.print("Masukan nilai UAS: "); //Untuk memberi tahu ini akan mengisi variabel mana
        nilaiUAS = sc.nextDouble(); //Untuk mengisi velue variabel nilai UAS

        //nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3; 
        nilaiAkhir = (nilaiKuis*20/100 ) + (nilaiTugas*15/100) + (nilaiUTS*30/100) + (nilaiUAS*35/100); //Untuk mengitung nilai akhir 

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM "+ nim + ")" + " kelas " + kelas + " absen " + absen ); // untuk menampilkan hasil output dari nama, nim, kelas, dan absen
        System.out.println("Nilai Akhir: " + nilaiAkhir); //Untuk nanampilkan hasil output nilai akhir
    }
}
