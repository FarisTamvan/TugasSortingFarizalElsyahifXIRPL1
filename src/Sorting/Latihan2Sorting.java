
package Sorting;

        import java.util.Arrays;
        import java.util.Scanner;

public class Latihan2Sorting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                System.out.println("Pengurutan data ");
                System.out.print("Masukkan jumlah Data anda  : ");
                int n= scan.nextInt();

                int[] data = new int[n];
                System.out.println();
                for(int i = 0; i < n; i++)
                {
                    System.out.print("Input nilai Data ke-"+(i+1)+" : ");
                    data[i] = scan.nextInt();
                }
                System.out.println();
                System.out.println("Data sebelum diurutkan : ");
                for(int i = 0; i < n; i++)
                    System.out.print(data[i]+" ");

                System.out.println("");

                System.out.println("Data setelah diurutkan : ");
                for(int i = 0; i < n; i++)
                    System.out.print(data[i]+" ");
            }
        }