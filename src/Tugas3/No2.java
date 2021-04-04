
package Tugas3;
import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        //pendeklarasian variabel
        int B [] = {2, 4, 6, 8, 10, 12, 14, 16, 20};
        int cari;
        int IndeksAwal = 0; //0
        int IndeksAkhir = B.length-1;
        int ketemu= 0;
        int point = 0;
        
        //fitur Scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan data yang dicari : ");
        cari = scan.nextInt();
        System.out.println();
        
        //menampilkan data dalam array
        System.out.println("Isi data adalah ");
        for(int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        
        while ((IndeksAwal <= IndeksAkhir && (ketemu == 0))) {
            point = (IndeksAwal + IndeksAkhir) / 2;
            System.out.println("Indeks Pointer : " + point);
            if(cari == B[point]) {
                ketemu = 1;
                System.out.println("Data " + cari + " Telah ditemukan pada Indeks ke- " + point);
                
                
            }
            else if(cari < B[point]) {
                System.out.println("cari di kiri ");
                IndeksAkhir = point-1;
            }
            else{
                IndeksAwal = point+1;
                System.out.println("cari di kanan ");
            }
        }
        if(ketemu == 1)
            System.out.println("Kesimpulan : Data ditemukan");
        else
            System.out.println("Kesimpulan : Data tidak ditemukan");
   
    
        }
    }
    

