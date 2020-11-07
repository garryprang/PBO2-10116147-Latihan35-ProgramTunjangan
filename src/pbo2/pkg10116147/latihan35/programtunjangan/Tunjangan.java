/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan35.programtunjangan;

/**
 * @author
 * Nama      : Garry Prang
 * NIM       : 10116147
 * Kelas     : PBO-2
 * Deskripsi : Program untuk menghitung tunjangan.
 */
public class Tunjangan {
    public String status;
    public double gajiPokok;
    public double Tunjangan;
    
    public double menghitungTunjangan () {
        if (status.equals("Menikah")) {
            return 0.35 * gajiPokok;
        } else {
            return 0;
        }    
    }
    
    public double menghitungTotalGaji () {
        return gajiPokok + menghitungTunjangan();
    }
}
