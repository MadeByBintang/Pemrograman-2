import java.util.Scanner;

public class PRAK102_2310817110006_ABS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("");
        int angkaAwal = input.nextInt();

        int totalDeret = 10;
        
        int i = 0;

        while (i <= totalDeret) {
            int angka = (angkaAwal % 5 == 0) ? angkaAwal / 5 - 1 : angkaAwal;
            
            System.out.print(angka);
            
            if (i <= totalDeret - 1) {
                System.out.print(", ");
            }
            
            angkaAwal++;
            i++;
        }
    }
}