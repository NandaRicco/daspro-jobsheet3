import java.util.Scanner;

public class gaji {
    
    public static void main(String[] args) {
        
        Scanner gaji = new Scanner(System.in); //Untuk memanggil Scanner

        int jumlahJamKerja, upahperJam, bonus, pajak, gajiSementara, gajiBersih; //Untuk memberi tahu bahwa ada variabel bentuk int dengan nama jumlahJamKerja, upahperJam, bonus, pajak, gajiSementara, gajiBersih

        System.out.print("Jumlah jam kerja: "); //Untuk memberi tahu ini akan mengisi variabel mana
        jumlahJamKerja = gaji.nextInt(); //Untuk mengisi velue variabel jumlahJamKerja
        System.out.print("Upah per jam: "); //Untuk memberi tahu ini akan mengisi variabel mana
        upahperJam = gaji.nextInt(); //Untuk mengisi velue variabel upahperJam

        gajiSementara = jumlahJamKerja * upahperJam; //Untuk mengitung jumlah gaji sementara

        bonus = gajiSementara * 10 / 100; //Untuk menghitung jumlah bonus

        gajiSementara += bonus; //Untuk menggabungkan jumlah gaji sementara dengan bonus

        pajak = gajiSementara * 5 / 100; //Untuk menghitung pajak

        gajiBersih = gajiSementara - pajak; //Untuk menghitung gaji bersih yang diperoleh karyawan

        System.out.println("Jumlah bonus : " + bonus); //Untuk menampilkan jumlah bonus yang di dapat
        System.out.println("Jumlah pajak: " + pajak); //Untuk menampilkan jumlah pajak yang di dapat
        System.out.println("Total gaji bersih anda adalah: " + gajiBersih); //Untuk menampilkan total gaji bersih yang di dapat
    }
}
