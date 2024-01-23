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
public class Persegi extends bangun_datar {
   
    double sisi;
        
    @Override
    float luas(){
        float luas = (float) (sisi*sisi);
        System.out.println("Luas Persegi: " + luas);
        return 0;
        
    }
    
    @Override
    float keliling(){
       float keliling = (float) (4*sisi);
        System.out.println("Keliling Persegi: "+ keliling);
        return keliling;
        
    }
    
    }

