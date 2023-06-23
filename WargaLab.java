/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.wargalab;

import static com.mycompany.wargalab.pesanmenu.pesanmenu1;
import java.util.Scanner;

class pesanmenu{
    public String biasa;
    public String dobel;
    public String special;
    
    pesanmenu(String biasa,String dobel,String special){
        this.biasa=biasa;
        this.dobel=dobel;
        this.special=special;
    }
    
    public static void pesanmenu1(){
        Scanner s = new Scanner(System.in);
        while(true){
        System.out.println("Pilihan Menu");
        System.out.println("1. biasa (Rp. 5000,00)");
        System.out.println("2. dobel (Rp. 7000,00)");
        System.out.println("3. biasa (Rp. 9000,00)");
        System.out.print("pilih 1/2/3 :");
        int option = s.nextInt();
        switch(option){
            case 1:
                break;
            case 2:
                break;
            case 3: 
                break;
           
                
        }
            System.out.print("ingin memilih lagi(y/t)? ");
            String x = s.next();
            if (x.equals("t")) {
                break;
            }
        }

}
    
}
class lihatpesanan{

}



public class WargaLab {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
       while(true){
        System.out.println("==== selamat datang di ayam geprek kamal =======");
        System.out.println("1. Pesan Menu");
        System.out.println("2. Lihat Pesanan");
        System.out.println("3. Selesaikan Pemesanan");
        System.out.print("Pilihan 1/2/3 :");
        String x =scan.next();
        if(x.equals ("1")){
           pesanmenu1();
        } else if (x.equals ("2") ){
            
       }
       }
        
    }

   

   
}
