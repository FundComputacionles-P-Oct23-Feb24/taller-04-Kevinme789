/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedido;

import java.util.Scanner;

/**
 *
 * @author porke
 */
public class Pedido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        double total;
        String descripcion = "Memoria Ram";
        int cantidadBodega = 100;
        double precioUnidad = 150;
        int pedido;
        System.out.println("El articulo que usted desea comprar es: " + descripcion);
        System.out.println("El costo por unidad es de: " + precioUnidad);
        System.out.println("Ingrese la cantidad de unidades que desea comprar " );
        pedido = sc.nextInt();
        total = (precioUnidad * pedido);
        if ( pedido > cantidadBodega){
        System.out.println( "No contamos con esa cantidad de unidades");
        }
        else if (pedido > 50){ 
        total = total - (total * 0.15);
        System.out.println("El total a pagar de su pedido con descuento es de: " + total);
        }
        else{ 
        System.out.println("El total a pagar de su pedido es de: " + total);
        }
    }
    
}
