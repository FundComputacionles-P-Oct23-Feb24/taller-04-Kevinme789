/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradoscentigrados;

import java.util.Scanner;

/**
 *
 * @author porke
 */
public class Gradoscentigrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int gradosCentigrados;
        int gradosFarenheit;
        double gradosKelvin;
        System.out.println("Ingrese la temperatura en grados centigrados");
        gradosCentigrados = sc.nextInt();
        gradosFarenheit = (gradosCentigrados * 9/5 +32);
        gradosKelvin = (gradosCentigrados + 273.15);
        if (0 < gradosCentigrados && gradosCentigrados < 100){
        System.out.println( "En: " + gradosCentigrados + "°C: " + gradosKelvin + " Grados Kelvin");
        System.out.println( "En: " + gradosCentigrados + "°C: " + gradosFarenheit + " Grados Farenheit");
        }
        else{ 
        System.out.println("La temperatura ingresada debe ser positiva y menor o igual a 100");
        }
    }
    }

