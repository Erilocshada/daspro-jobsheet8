
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nilai N:");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++){
            for (int k = 1; k <= N; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
