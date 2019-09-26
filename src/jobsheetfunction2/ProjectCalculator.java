/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetfunction2;

/**
 *
 * @author KANG_SNAKE
 */
public class ProjectCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // kalkulator
        System.out.println("====KANGSNAKE_CALCULATOR====");
        System.out.println("penjumlahan"+penjumlahan(6,9));
        System.out.println("penguragan"+pengurangan(99,03));
        System.out.println("perkalian"+perkalian(6,9));
        System.out.println("Sisahasilbagi"+sisahasilbagi(789,10));
    }
    public static int penjumlahan(int bil1,int bil2){
        int hasil = bil1 + bil2;
        return hasil;
        
    }
    public static int pengurangan(int bil1,int bil2){
        int hasil = bil1 - bil2;
        return hasil;
        
    }
    public static int perkalian(int bil1, int bil2){
        int hasil = bil1 * bil2;
        return hasil;
        
    }
    public static double sisahasilbagi(int bil1, int bil2) {
        double hasil = bil1 % bil2;
        if(bil1<bil2){
            hasil = 0;
        }
        return hasil;
            
        }
}

            
  
        
            
        
            
        
           
        

            
        
        
        
    

        
    
   
        
    
        
    
        
    
        
    
        
    
        
               
        
    
    

