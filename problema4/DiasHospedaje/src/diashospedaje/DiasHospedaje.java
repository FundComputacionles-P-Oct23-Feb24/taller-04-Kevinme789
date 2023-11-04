/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diashospedaje;

import java.util.Scanner;

/**
 *
 * @author porke
 */
public class DiasHospedaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total;
        double subtotal;
        int diasHospedado;
        double precioDia;
        double descuento;
    System.out.println("Ingrese el numero de dias que se hospedo");
    diasHospedado = sc.nextInt();
    System.out.println("Ingrese el precio por dia de hospedaje");
    precioDia = sc.nextInt();
    subtotal = (diasHospedado * precioDia);
    if (diasHospedado > 15){
        descuento = subtotal * 0.2;
        total = subtotal - descuento;
       System.out.println("Subtotal: $" + subtotal);
       System.out.println("Descuento: $" + descuento);
       System.out.println("Total a pagar: $" + total);

    }
    else if (diasHospedado > 10){
        descuento = subtotal * 0.15;
        total = subtotal - descuento;
       System.out.println("Subtotal: $" + subtotal);
       System.out.println("Descuento: $" + descuento);
       System.out.println("Total a pagar: $" + total);

    }
    else if (diasHospedado > 5){
        descuento = subtotal * 0.1;
        total = subtotal - descuento;
       System.out.println("Subtotal: $" + subtotal);
       System.out.println("Descuento: $" + descuento);
       System.out.println("Total a pagar: $" + total);

    }
    else{
        total = subtotal;
       System.out.println("Subtotal: $" + subtotal);
       System.out.println("Descuento: No aplica");
       System.out.println("Total a pagar: $" + total);
    }
    }
    
}
