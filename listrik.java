import java.util.Scanner;

public class listrik {
    
    public static void main(String[] args) {
         
        Scanner listrik = new Scanner(System.in);

        int kwh, mkwh;
        mkwh = 500;

        System.out.println("Masukan kwh: ");
        kwh = listrik.nextInt();

        System.out.println(kwh > mkwh);
    }
}
