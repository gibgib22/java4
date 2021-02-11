package tugas;

import java.util.Scanner;

public class tugaspraktikum {

    public static void main(String[] args) {
        String[] namasiswa = {"Deanne", "Victoria", "Erna", "Natalie", "Pamela", "Ahmad", "Omar", "Alvaro", "Dany", "Ben"};
        String cari;
        int x = 0;
        boolean found = false;
        Scanner div = new Scanner(System.in);

        System.out.println("List data");
        for (int i = 0; i < namasiswa.length; i++) {
            System.out.println("" + namasiswa[i]);
        }
        System.out.println("Masukkan data yang akan anda cari");
        cari = div.next();

        for (int index = 0; index < namasiswa.length; index++) {
            if (namasiswa[index].equals(cari)) {
                found = true;
                System.out.println("data di temukan");
            }
        }
        if (found == false){
            System.out.println("data tidak di temukan");}

    }
}
