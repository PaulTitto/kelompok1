/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok1;

/**
 *
 * @author ASUS
 */
public class Adik {
    
 //methods void
        //atributes
        int angka1;
        int angka2;
        
        Adik (int a, int b){
        this.angka1 = a;
        this.angka2 = b;
        }
        
        
        //methods
        void calculatePerkalian(){
            int perkalian = this.angka1 * this.angka2;
            System.out.println("Hasilnya adalah : " );
 
        }
        
    public static void main(String[] args){
        Adik Z = new Adik (5, 15);
        Z.calculatePerkalian();
        System.out.println("Hasilnya adalah : " );
    }
    
    
}
