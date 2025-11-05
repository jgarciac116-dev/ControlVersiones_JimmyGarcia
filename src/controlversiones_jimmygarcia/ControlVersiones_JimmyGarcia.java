/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlversiones_jimmygarcia;

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
        double[] notas = {85, 93, 78, 91};
        double promedio = calcularPromedio(notas);
        System.out.println("El promedio es: " + promedio);
    }
    
    public static double calcularPromedio(double[] numeros) {
    double suma = 0;
    for (double num : numeros) {
        suma += num;
    }
    return suma / numeros.length;
    }
    
}
