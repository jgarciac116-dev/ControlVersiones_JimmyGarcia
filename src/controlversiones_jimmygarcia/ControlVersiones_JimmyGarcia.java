/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlversiones_jimmygarcia;

import java.util.Scanner;

/**
 *
 * @author Jimmy
 */
public class ControlVersiones_JimmyGarcia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Calculadora de Promedios ===");
        System.out.print("¿Cuántas notas desea ingresar? ");
        int cantidad = scanner.nextInt();

        if (cantidad <= 0) {
            System.out.println("Error: Debe ingresar al menos una nota.");
            return;
        }

        double[] notas = new double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double promedio = calcularPromedio(notas);
        System.out.println("El promedio final es: " + promedio);
    }
    
    public static double calcularPromedio(double[] numeros) {
    double suma = 0;
    for (double num : numeros) {
        suma += num;
    }
    return suma / numeros.length;
    }
    
}
