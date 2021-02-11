package tugas;

import java.util.Scanner;

public class latihan2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //memasukan jumlah data
        System.out.println("masukan jumlah data : ");
        int length = scan.nextInt();

        //menyimpan pada array
        int input[] = new int [length];
        
        //membuat elemen array
        System.out.println("masukan data anda : ");
        for (int i = 0; i < length; i++){
            int userinput = scan.nextInt();
            input[i] = userinput;
            
        //membuat ganjil genap
            if (input[i] % 2 == 0){
                System.out.println("bilangan genap");
                System.out.println("===========");
            } else {
                System.out.println("bilangan ganjil");
                System.out.println("===========");
            }
        }
    }
}
