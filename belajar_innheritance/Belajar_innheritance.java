/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar_innheritance;

/**
 *
 * @author MOKLET001
 */
public class Belajar_innheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       bangun_datar bangunDatar = new bangun_datar();
       
       Persegi persegi = new Persegi();
       persegi.sisi = 2;
       
       lingkaran Lingkaran = new lingkaran();
       Lingkaran.r = 22;
       
       persegi_panjang PersegiPanjang = new persegi_panjang();
       PersegiPanjang.panjang = 8;
       PersegiPanjang.lebar = 4;
       
       segitiga Segitiga = new segitiga();
       Segitiga.alas = 12;
       Segitiga.tinggi = 8;
       
       bangunDatar.luas();
       bangunDatar.keliling();
       
       persegi.luas();
       persegi.keliling();
       
       Lingkaran.luas();
       Lingkaran.keliling();
       
       PersegiPanjang.luas();
       PersegiPanjang.keliling();
       
       Segitiga.luas();
       Segitiga.keliling();
        
       
       
    }
    
}
