/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema02;
import java.util.Scanner;
/**
 *
 * @author Usuario Win11
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombrePrimerHijo;
        String nombreSegundoHijo;
        String nombreTercerHijo;
        double primerHijo;
        double segundoHijo;
        double tercerHijo;
        double gastoTotal;
        
        System.out.println("Ingrese el nombre del pirmer hijo");
        nombrePrimerHijo = entrada.nextLine();
        System.out.println("Ingrese los gastos del pirmer hijo");
        primerHijo = entrada.nextDouble();
        System.out.println("Ingrese el nombre del segundo hijo");
        entrada.nextLine();
        nombreSegundoHijo = entrada.nextLine();
        System.out.println("Ingrese los gastos del segundo hijo");
        segundoHijo = entrada.nextDouble();
        System.out.println("Ingrese el nombre del tercer hijo");
        entrada.nextLine();
        nombreTercerHijo = entrada.nextLine();
        System.out.println("Ingrese los gastos del tercer hijo");
        tercerHijo = entrada.nextDouble();
                
        gastoTotal = (primerHijo + segundoHijo + tercerHijo);
        
        System.out.printf("Hijo 1:%s\nGastos 1:%.2fHijo 2:%s\nGastos 2:%.2f"
                + "Hijo 3:s%\nGastos 3:%.2f\nGastos totales:%.2f\n ",
                nombrePrimerHijo,
                primerHijo,
                nombreSegundoHijo,
                segundoHijo,
                nombreTercerHijo,
                tercerHijo,
                gastoTotal);
    }
}
