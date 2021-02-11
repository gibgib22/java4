
package ukl;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class NewClass {
    public static void nilai(){
    Scanner div = new Scanner (System.in);
        int x = 0;
        boolean found = false;
            System.out.println("===============================================");
            System.out.println("           S E L A M A T  D A T A N G          ");
            System.out.println("===============================================");
            System.out.println("\t DAFTAR NILAI SISWA X TKJ");
            System.out.println("===============================================");
            System.out.println("\n");
            String[] nama = {"Adam" , "Bashir" , "Devon" , "Fahtan" , "Lukman" , "Syihab" , "Yeremi"};
            String [] uh = {"UH1","UH2","UH","UTS","PAS","NA"};
                
            System.out.println("\t Data Nama Siswa X TKJ : ");
                for (int i=0; i<nama.length;i++)
                {
                    System.out.println("" + nama[i]);
                }
            System.out.println("\n\t data nilai yang akan di input");    
                for (int i=0;i<uh.length;i++){
                    System.out.println("" + uh[i]);
                }
            System.out.println("Masukan nilai Adam:");
            for(int i = 0; i<6;i++)
            {
                System.out.println("");
                System.out.print(uh[i]+"");
                int nilai = div.nextInt();
            }
            System.out.println("Masukan nilai Bashir:");
            for(int i = 0; i<6;i++)
            {
                System.out.println("");
                System.out.print(uh[i]+"");
                int nilai = div.nextInt();
            }System.out.println("Masukan nilai Devon:");
            for(int i = 0; i<6;i++)
            {
                System.out.println("");
                System.out.print(uh[i]+"");
                int nilai = div.nextInt();
            }System.out.println("Masukan nilai fahtan:");
            for(int i = 0; i<6;i++)
            {
                System.out.println("");
                System.out.print(uh[i]+"");
                int nilai = div.nextInt();
            }System.out.println("Masukan nilai Lukman:");
            for(int i = 0; i<6;i++)
            {
                System.out.println("");
                System.out.print(uh[i]+"");
                int nilai = div.nextInt();
            }System.out.println("Masukan nilai Syihab:");
            for(int i = 0; i<6;i++)
            {
                System.out.println("");
                System.out.print(uh[i]+"");
                int nilai = div.nextInt();
            }System.out.println("Masukan nilai Yeremi:");
            for(int i = 0; i<6;i++){
                System.out.println("");
                System.out.print(uh[i]+"");
                int nilai = div.nextInt();
            }
    } public static void main(String[] args) {
        nilai();
    }
}
