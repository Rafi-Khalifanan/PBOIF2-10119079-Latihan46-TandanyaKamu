package pboif2.pkg10119079.latihan46.tandanyakamu;
import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan46TandanyaKamu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Age age = new Age(2020);
        
        
        System.out.print("Masukkan Tahun Lahir Anda : ");        
        age.setYearBirth(input.nextInt()); 
        
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu " + age.tandanyaKamu(age.hitungUmur()));
    }
    
}


