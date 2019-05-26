/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikidizitoplama;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Eren
 */
public class IkiDiziToplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int diziBoyut;
        Scanner oku = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Dizi boyutunu giriniz : ");
        diziBoyut = oku.nextInt();
        int dizi1[] = new int[diziBoyut];
        int dizi2[] = new int[diziBoyut];
        int diziToplam[] = new int[diziBoyut];
        System.out.println("A Dizisi");
        for (int i = 0; i < diziBoyut; i++) {
            
            dizi1[i] = r.nextInt(100)+1;
            System.out.print("A|"+ i +"|=" + dizi1[i]);
            System.out.print(" ");
        }
        System.out.println("");
        System.out.print("B Dizisi");
        System.out.println("");
        for (int i = 0; i < diziBoyut; i++) {
            
            dizi2[i] = r.nextInt(100)+1;
            System.out.print("B|"+ i +"|=" + dizi2[i]);
            System.out.print(" ");
        }
        System.out.println("");
        System.out.print("C Dizisi");
        System.out.println("");
        for (int i = 0; i < diziBoyut; i++) {
            
            diziToplam[i] = dizi1[i] + dizi2[i];
            System.out.print("C|"+ i +"|=" + diziToplam[i]);
            System.out.print(" ");
        }
    }
    
}
