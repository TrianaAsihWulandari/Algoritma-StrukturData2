
package Tugas3;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        System.out.println("***** SEQUENTIAL SEARCH *****"+"\n");
        String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Triana Asih Wulandari", "Tesla"};
        String key ;
        
        //fitur Scanner
        Scanner scan = new Scanner(System.in);
        System.err.print("Masukan data yang dicari : ");
        key = scan.nextLine();
        System.out.println();
        
        //menampilkan data array
        System.out.print("Isi data adalah : ");
        for(int i =0; i < data.length; i++) {
            System.out.print(data[i] + " ");
            
            
        }
       
        System.out.println();
        
        for(int i = 0; i < data.length; i++) {
            if(key.equalsIgnoreCase(data[i])) {
                System.out.print("Data " + key + " Berada pada indeks ke- " + i);
                break; //stop perulangan
            }
        }
        
        System.out.println("\n");
        System.out.println();
        System.out.println("*****Terima Kasih*****");
}
    
}
