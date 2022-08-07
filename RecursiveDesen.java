/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursivedesen;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class RecursiveDesen {

    /**
     * @param args the command line arguments
     */
    
    static int desenCikar(int n){
        if(n<=0){
            return n;
        }
        System.out.print(n + " ");
        return desenCikar(n-5);
        
    }
    
    static int desenTopla(int n, int sayi ) {
        if (n > sayi) return n;
        System.out.print(n + " ");
        return desenTopla(n + 5,sayi);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("N Sayisini Giriniz:");
        int n=input.nextInt();
        desenTopla(desenCikar(n), n);
        
    }
    
}
