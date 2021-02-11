package ukl1;

import java.util.Scanner;

/**
 *
 * @author DIVANA
 */
public class UKL1 {
    public static void toko() {
        Scanner div = new Scanner (System.in);
        String Cari;
        int x = 0;
        boolean found = false;
        
        System.out.println("===============================================");
        System.out.println("\t DAFTAR NILAI SISWA X TKJ");
        System.out.println("===============================================");
        System.out.println("\n");
        String[] nama = {"Adam" , "Bahir" , "Devon" , "Fahtan" , "Lukman" , "Syihab" , "Yeremi"};
        
        System.out.println("\t Data Nama Siswa X TKJ : ");
        for (int i=0; i<nama.length;i++)
        {
            System.out.println("" + nama[i]);
        }
        int[][] nilai = new int [6][7];
    }
    public void input(int a, int nilai[][]){
        Scanner div = new Scanner (System.in);
        System.out.println("===============================================");
        System.out.println("\t Masukkan Data Nilai");
        for (a=0;a<nilai;a++){
        System.out.print("Ulangan Harian 1 :");
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
        if (nilai[5][a] == 100) {
            System.out.println("Skor nilai : A ");
        } 
        else if (nilai[5][a] >= 93) {
            System.out.println("Skor nilai : B");
        }
        else if (nilai[5][a] >= 82) {
            System.out.println("Skor nilai : C");
        }
        else if (nilai[5][a] >= 74) {
            System.out.println("Skor nilai : D");
        }
        else if (nilai[5][a] >= 50) {
            System.out.println("Skor nilai : E");
        }
        }
    }
    public static void main(String[] args) {
        toko();
        input();
                        switch (jeneng){
                            case "Adam" : 
                                a = 0;
                            case "Bashir" :
                                a = 1;
                            case "Devon" :
                                a = 2;
                            case "Fahtan" :
                                a = 3;
                            case "Lukman" :
                                a = 4;
                            case "Syihab" :
                                a = 5;
                            case "Yeremi" :
                                a = 6;
                        }
    }
}
 

