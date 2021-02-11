package tugas;

import java.util.Scanner;

public class Tugas {

    public static void main(String[] args) {
        int i, a, b, c;

        Scanner scanner = new Scanner(System.in);
        System.out.print("input angka: ");
        a = scanner.nextInt();

        for (i = 1; i <= a; i++) {
            for (b = a; b >= i; b--) {
                System.out.print(" ");
            }
            for (c = 1; c <= i; c++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

}
