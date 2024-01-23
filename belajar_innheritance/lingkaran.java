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
public class lingkaran extends bangun_datar{
    float r;
    
    @Override
    float luas(){
    float luas = (float) (Math.PI * r * r);
    System.out.println("luas lingkaran: "+luas);
    return luas;
    
    }
    @Override
  float keliling(){
      float keliling = (float) (2*Math.PI*r);
      System.out.println("keliling lingkaran: "+keliling);
      return keliling;
  }
    
}
