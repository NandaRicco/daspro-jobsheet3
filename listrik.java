import java.util.Scanner;

public class listrik {
    
    public static void main(String[] args) {
         
        Scanner listrik = new Scanner(System.in); //Untuk memanggil Scanner

        int kWh, penggunaanListrik, totalTagihan, hargaListrik; //untuk memberi tahu bahwa ada variabel bentuk int dengan nama kWh, penggunaanListrik, totalTagihan, hargaListrik = 1500
        penggunaanListrik = 500; //Untuk memberi nilai variable penggunaanListrik
        hargaListrik = 1500; //Untuk memberi nilai variable hargaListrik
        
        System.out.print("Masukan kWh: "); //Untuk memberi tahu ini akan mengisi variabel mana
        kWh = listrik.nextInt(); //Untuk mengisi velue variabel kWh

        totalTagihan = kWh * hargaListrik; //Untuk menghitung total tagihan

        if (kWh > penggunaanListrik){ //Semua kondisi untuk mengecek kWh
            System.out.println("kWh melebihi dari 500 kWh"); //Jika lebih besar dari penggunaan listrik akan muncul tulisan di sini
        } else { //Jika kondisinya tidak sesuai
            System.out.println("kWh tidak melebihi dari 500 kWh");//Jika lebih kecil dari penggunaan listrik akan muncul tulisan di sini
        }

        System.out.println("Total tagihan listrik anda: " + totalTagihan); //Untuk menampilkan total tagihan listrik
    }
}