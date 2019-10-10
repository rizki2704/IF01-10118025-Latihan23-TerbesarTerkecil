/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan23.terbesarterkecil;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 * 
 */
public class TerkecilTerbesar {

    String nama;
    int jmlhMhs, min = 100, max = 0;
    
    Scanner scan = new Scanner(System.in);
    
    public void kecilBesar(){
        System.out.println("===Program Nilai Terbesar dan Nilai Terkecil===");
        System.out.println("Masukkkan Nama Petugas : ");
        nama = scan.nextLine();
        System.out.println("Masukkan Banyaknya Nilai Mahasisa : ");
        jmlhMhs = scan.nextInt();
        
        int[] nilaiMahasiswa = new int[jmlhMhs];
        
        for (int i = 0; i <= (jmlhMhs - 1); i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " = ");
            nilaiMahasiswa[i] = scan.nextInt();
        }
        
        System.out.println("\n===Hasil Nilai Mahasiswa===");
        for (int i = 0; i<= (jmlhMhs - 1); i++){
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " = " + nilaiMahasiswa[i]);
            
            if(nilaiMahasiswa[i] > max){
                max = nilaiMahasiswa[i];
            }
            if(nilaiMahasiswa[i] < min){
                min = nilaiMahasiswa[i];
            }
        }
        System.out.printf("%nNilai Terbesar adalah %d", max);
        System.out.printf("%nNilai Terkecil adalah %d%n%n", min);
        System.out.println("Petugas\t: " + nama);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        TerkecilTerbesar terkecilBesar = new TerkecilTerbesar();
        terkecilBesar.kecilBesar();
    }
    
}
