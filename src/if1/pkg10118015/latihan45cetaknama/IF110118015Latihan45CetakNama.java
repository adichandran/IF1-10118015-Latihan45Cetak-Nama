/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan45cetaknama;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program untuk mencetak nama sebanyak yang diinginkan oleh user
 */
public class IF110118015Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Printer pt = new Printer();
        System.out.println("=== Aplikasi Pencetak Nama===");
        System.out.print("Masukkan Nama Anda : ");
        pt.setNama(input.nextLine());
        System.out.print("Mau Cetak Berapa Kali? : ");
        pt.setJmlCetak(input.nextInt());
        pt.cetak(pt.getNama());
        pt.cetak(pt.getJmlCetak(), pt.getNama());
    }
    
}
