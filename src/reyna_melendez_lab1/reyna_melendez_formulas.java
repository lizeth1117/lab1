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
public class reyna_melendez_formulas {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
       System.out.println("Para el inciso a Ingrese el Numerador 1");
       int numeradorA1= entrada.nextInt();
       System.out.println("Para el inciso a Ingrese el Denominador 1");
       int denominadorA1= entrada.nextInt();
       System.out.println("Para el inciso a Ingrese el Numerador 2");
       int numeradorA2= entrada.nextInt();
       System.out.println("Para el inciso a Ingrese el Denominador 2");
       int denominadorA2= entrada.nextInt();
       
       int resultadonumerador= (numeradorA1*denominadorA2)+(numeradorA2*denominadorA2);
       int resultadodenominador= denominadorA1*denominadorA2 ;
               
    
       
        System.out.println("El resultado es de "+resultadonumerador+"/"+resultadodenominador);
        
        
    }
}
