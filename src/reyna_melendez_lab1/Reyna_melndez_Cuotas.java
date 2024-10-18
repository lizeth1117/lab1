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
public class Reyna_melndez_Cuotas {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Ingrese el monto del prestamo. ");
        double prestamo= entrada.nextDouble();
        System.out.println("Ingrese los meses del prestamo");
        int meses= entrada.nextInt();
        System.out.println("Ingrese el interes mensual.");
        double interes= entrada.nextDouble()/100;
        System.out.println("Ingrese el procentaje de comision mensual");
        double comision=entrada.nextDouble()/100;
        System.out.println("Ingrese el porcentaje del seguro mensual. ");
        double seguro=entrada.nextDouble()/100;
        
        double cuotamensual= prestamo/meses ;
        double coutainteres= cuotamensual*interes ;
        double coutacomision= cuotamensual*comision ;
        double coutaseguro= cuotamensual*seguro ;
        double cuotatotal= cuotamensual+coutainteres+coutacomision+coutaseguro ;
        double prestamototal= cuotatotal*meses ;
        System.out.println(" **** CUOTAS MENSUALES *******\n Cuota mensual es de: "+cuotatotal+"\n"
                + "Total a pagar: "+prestamototal);
        
               
        
        
                
                
                
        
                
      
    }
}
