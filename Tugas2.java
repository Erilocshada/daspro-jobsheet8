import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        final int jumlahAtletPerCabor = 5; 
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", 
"Basket", "Bola Voli"}; // Menggunakan array untuk cabang olahraga 
 
        String[][] atlet = new 
String[cabangOlahraga.length][jumlahAtletPerCabor]; 
 
        for (int i = 0; i < cabangOlahraga.length; i++) { 
            System.out.print("Masukkan jumlah politeknik untuk cabor " + cabangOlahraga[i] + ": "); 
            int jumlahPoliteknik = sc.nextInt(); 
             
            for (int j = 0; j < jumlahPoliteknik; j++) { 
                System.out.println("Masukkan nama atlet untuk Politeknik ke-" + (j + 1) + " di " + cabangOlahraga[i] + ":"); 
                for (int k = 0; k < jumlahAtletPerCabor; k++) { 
                    System.out.print("Atlet ke-" + (k + 1) + ": "); 
                    int indeks = j * jumlahAtletPerCabor + k;  
                    atlet[i][indeks] = sc.next();  
                } 
            } 
        } 
        System.out.println("\nInformasi Atlet Porseni 2024:"); 
        for (int i = 0; i < cabangOlahraga.length; i++) { 
            System.out.println("\nCabang Olahraga: " + cabangOlahraga[i]); 
            for (int j = 0; j < jumlahAtletPerCabor; j++) { 
                if (atlet[i][j] != null) {  
                    System.out.println("Atlet ke-" + (j + 1) + ": " + atlet[i][j]); 
                } 
            } 
        }
        sc.close(); 
    } 
}
