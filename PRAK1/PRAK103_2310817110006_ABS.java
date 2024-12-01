import java.util.Scanner;

public class PRAK103_2310817110006_ABS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Nilai N dan Bilangan Awal: ");
        int nilaiN = input.nextInt();
        int bilanganAwal = input.nextInt();
        
        int i = 0;
        int j = bilanganAwal;

        do {
            if (j % 2 != 0) {
                System.out.printf("%d", j);
                
                if (i < nilaiN - 1) {
                    System.out.printf(", ");
                }
                i++;
            }
            j++;
        } while (i < nilaiN);
    }
}