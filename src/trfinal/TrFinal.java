/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trfinal;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class TrFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vt1,vt2,vt3;
      double sm,ptc,c;
      String Vendedor;
      
      Scanner Lectura=new Scanner(System.in);
        System.out.print("Nombre del vendedor : ");
        Vendedor=Lectura.next();
        System.out.print("Sueldo Mensual : s/");
        sm=Lectura.nextDouble();
        System.out.print("Venta 1 : s/ ");
        vt1=Lectura.nextInt();
        System.out.print("Venta 2 : s/");
        vt2=Lectura.nextInt();
        System.out.print("Venta 3 : s/");
        vt3=Lectura.nextInt();
        c=(vt1+vt2+vt3)*0.10;
        ptc=sm+c;
        System.out.println("La comision de venta es : S/"+c);
        System.out.println("El sueldo mensual del vendedor es : s/"+ptc);
    }
    
}
