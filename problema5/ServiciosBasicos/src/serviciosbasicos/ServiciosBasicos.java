/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serviciosbasicos;

import java.util.Scanner;

/**
 *
 * @author porke
 */
public class ServiciosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total;
        double litrosAgua;
        double costoAgua;
        int minutos;
        double costoMinuto;
        int edad;
        System.out.println("Ingrese el número de litros de agua consumidos en el mes");
        litrosAgua = sc.nextDouble();
        System.out.println("Ingrese el costo de cada litro de agua");
        costoAgua = sc.nextDouble();
        System.out.println("Ingrese el número de minutos gastados en el mes");
        minutos = sc.nextInt();
        System.out.println("Ingrese el costo de cada minuto");
        costoMinuto = sc.nextDouble();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        
        total = ((litrosAgua * costoAgua) + (minutos * costoMinuto));
        if (edad < 20){
            total = (total - (total * 0.2));
        System.out.println( "El valor total a pagar mensual con desucento es de: $" + total);
        }
        else{ 
        System.out.println("El valor total a pagar mensual es de: $" + total);
        }

    }
    
}
