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
public class segitiga extends bangun_datar {
    float alas;
    float tinggi;
    
    
    @Override
    float luas(){
        float luas = 1/2*(alas*tinggi);
        System.out.println("luas segitiga: "+luas);
        return luas;
    }
    
}
