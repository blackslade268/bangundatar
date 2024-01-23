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
public class persegi_panjang extends bangun_datar{
float panjang;
float lebar;

@Override
float luas(){
    float luas = panjang * lebar;
    System.out.println("luas persegi panjang: "+luas);
    return luas;
}

@Override
float keliling(){
    float keliling = 2*panjang+2*lebar;
    System.out.println("keliling persegi panjang: "+keliling);
    return keliling;
}
    
}
