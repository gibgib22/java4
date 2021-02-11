package ukl;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class UKL {
    public static void Nilai() {
        Scanner div = new Scanner (System.in);
        String Cari,gh = null,ij;
        int x = 0;
        boolean found = false;
                System.out.println("===============================================");
                System.out.println("           S E L A M A T  D A T A N G          ");
                System.out.println("===============================================");
                System.out.println("\t DAFTAR NILAI SISWA X TKJ");
                System.out.println("===============================================");
                System.out.println("\n");
                String[] nama = {"Adam" , "Bashir" , "Devon" , "Fahtan" , "Lukman" , "Syihab" , "Yeremi"};
        
                System.out.println("\t Data Nama Siswa X TKJ : ");
                for (int i=0; i<nama.length;i++)
                {
                    System.out.println("" + nama[i]);
                }
                int[][] nilai = new int [6][7];
                int a = 0;
                System.out.println("");
                do{
                    System.out.println("===============================================");
                    System.out.println("\ninputkan nilai siswa");
                    System.out.print("\nNama Siswa : ");
                    String jeneng = div.next();
                    
                    switch (jeneng){
                        case "Adam" :
                            a = 0;
                            break;
                        case "Bashir" :
                            a = 1;
                            break;
                        case "Devon" :
                            a = 2;
                            break;
                        case "Fahtan" :
                            a = 3;
                            break;
                        case "Lukman" :
                            a = 4;
                            break;
                        case "Syihab" :
                            a = 5;
                            break;
                        case "Yeremi" :
                            a = 6;
                            break;
                        default: a=-1;break;
                    }
                    if(a==-1)
                        break;
                    System.out.print("\nUlangan Harian 1 :");
                    nilai[0][a]=div.nextInt();
                    System.out.print("Ulangan Harian 2 :");
                    nilai[1][a]=div.nextInt();
                    System.out.print("Ulangan Harian :");
                    nilai[2][a]=div.nextInt();
                    System.out.print("Ujian Tengah Semester :");
                    nilai[3][a]=div.nextInt();
                    System.out.print("Penilaian Akhir Semester :");
                    nilai[4][a]=div.nextInt();
                    System.out.print("Nilai Akhir :");
                    nilai[5][a]= (nilai[0][a]+nilai[1][a]+nilai[2][a]+nilai[3][a]+nilai[4][a])/5;
                    System.out.println(nilai[5][a]);
                    if (nilai[5][a] >= 94) {
                        System.out.println("Skor nilai : A ");
                    } 
                    else if (nilai[5][a] >= 83) {
                        System.out.println("Skor nilai : B");
                    }
                    else if (nilai[5][a] >= 74) {
                        System.out.println("Skor nilai : C");
                    }
                    else if (nilai[5][a] >= 50) {
                        System.out.println("Skor nilai : D");
                    }
                    else if (nilai[5][a] >= 0) {
                        System.out.println("Skor nilai : E");
                    }
                    System.out.println("===============================================");
                    System.out.println("\nApakah perlu menginputkan nilai lagi?");
                    ij = div.next();
                } while(ij.equals("iya")||ij.equals("y"));
                System.out.println("\tTERIMA KASIH");
    }
}
