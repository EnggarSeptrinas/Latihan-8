package Interface;
import java.util.Scanner;

public class CekMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai   \t:");
        double nilai = input.nextInt();
        nilai = nilai * 2.5;//pengujian termasuk integer atau double
        System.out.print("Nilai Setelah Dikalikan adalah    \t:"+nilai);
        System.out.println("");
        Cek cek = new Cek(nilai);
        
        
        
    }
    
}
