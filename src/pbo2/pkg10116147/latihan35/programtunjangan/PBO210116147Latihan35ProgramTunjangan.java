/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan35.programtunjangan;

import java.util.Scanner;

/**
 * @author
 * Nama      : Garry Prang
 * NIM       : 10116147
 * Kelas     : PBO-2
 * Deskripsi : Program untuk menghitung tunjangan.
 */
public class PBO210116147Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Tunjangan tj = new Tunjangan();
        System.out.println("======= Program Tunjangan =======");
        System.out.print("Gaji perbulan\t\t: Rp");
        tj.gajiPokok = sc.nextInt();
        System.out.print("Status (Menikah/Belum)\t: ");
        Scanner st = new Scanner(System.in);
        tj.status = st.nextLine();
        
        System.out.println();
        
        System.out.println("======= Hasil Perhitungan =======");
        System.out.println("Gaji pokok\t: Rp" + tj.gajiPokok);
        System.out.println("Tunjangan\t: Rp" + tj.menghitungTunjangan());
        System.out.println("Total gaji\t: Rp" + tj.menghitungTotalGaji());
    }
    
}
