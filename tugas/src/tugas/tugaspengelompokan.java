package tugas;

import java.util.Scanner;

public class tugaspengelompokan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // masukan jumlah data 
        System.out.print("jumlah data yang akan di uji : ");
        int length = scan.nextInt();

        // membuat batas array
        int array[] = new int[length];

        // memasukan data
        System.out.println("masukan data yang akan di uji : ");
        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("====================");

        System.out.println("bilangan genap = ");
        for (int y = 0; y < array.length; y++) {
            if (y % 2 == 0) {
                System.out.print(array[y]);
                System.out.println(" ");
            }
        }
        System.out.println("---------------------");

        System.out.println("bilangan ganjil = ");
        for (int a = 0; a < array.length; a++) {
            if (a % 2 != 0) {
                System.out.println(array[a]);

            }
        }

    }
}
