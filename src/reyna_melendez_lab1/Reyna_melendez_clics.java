/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reyna_melendez_lab1;

import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class Reyna_melendez_clics {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        
        System.out.println("Ingrese cuantos clics tuvo el anuncio 1: ");
        int clics1= entrada.nextInt();
        System.out.println("Ingrese el Costo por clics del anuncio 1:");
        double costos1= entrada.nextDouble();
        System.out.println("Ingrese cuantos clics tuvo el anuncio 2");
        int clics2= entrada.nextInt();
        System.out.println("Ingrese el Costo por clics del anuncio 1:");
        double costos2= entrada.nextDouble();     
        System.out.println("Ingrese cuantos clics tuvo el anuncio 3: ");
        int clics3= entrada.nextInt();
        System.out.println("Ingrese el Costo por clics del anuncio 1:");
        double costos3= entrada.nextDouble();
        double totalcostos= ((clics1*costos1)+(clics2*costos2)+(clics3*costos3)) ;
        int totalclics= (clics1+clics2+clics3) ;
        double promedio=(totalcostos/totalclics) ;
        double impuesto= totalcostos*1.16 ;
        System.out.println("El Costo Promedio por clic es de: "+String.format("%.2f",promedio)+"\n"+"El subtotal es de "+String.format("%.2f",totalcostos)+"\n"
                + "y el total con ISV es de: "+String.format("%.2f",impuesto));
        
    }
}
