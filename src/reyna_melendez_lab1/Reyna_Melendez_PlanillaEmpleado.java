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
public class Reyna_Melendez_PlanillaEmpleado {
    
    public static void main(String[] args) {
        
    double horas,tarifahora;
    String nombre ;
    Scanner entrada=new Scanner(System.in).useDelimiter("\n");
    
   System.out.println("Ingrese el nombre completo del empleado: ");
    nombre= entrada.next();
   System.out.println("Ingrese el la tarifa por hora del empleado: ");   
   tarifahora= entrada.nextDouble();
   System.out.println("Ingrese el las horas trabajas por el empleado: ");    
   horas=entrada.nextDouble();
   double salario=horas*tarifahora ;
   
   System.out.println("*****BOLETA DE EMPLEADO****** \n "
           + "Nombre del Empleado"+nombre+"\n"
           + "Hora de Trabajo Mensual: "+horas+"\n"
           + "Tarifa por Hora : Lps."+tarifahora+"\n"
           + "Salario del Empleado Semanal: Lps."+salario);
   
          
    }      
}
